package com.paralun.app.nio;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.util.List;

public class BasicAttributesDemo {
    public static void main(String[] args) {

    }

    public static void nioBasicFileAttributes(Path path) throws IOException {

        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);

        // Print basic file attributes
        System.out.println("Creation Time: " + basicFileAttributes.creationTime());
        System.out.println("Last Access Time: " + basicFileAttributes.lastAccessTime());
        System.out.println("Last Modified Time: " + basicFileAttributes.lastModifiedTime());
        System.out.println("Size: " + basicFileAttributes.size());
        System.out.println("Is Regular file: " + basicFileAttributes.isRegularFile());
        System.out .println("Is Directory: " + basicFileAttributes.isDirectory());
        System.out.println("Is Symbolic Link: " + basicFileAttributes.isSymbolicLink());
        System.out.println("Other: " + basicFileAttributes.isOther());

        // modify the lastmodifiedtime
        FileTime newModifiedTime = FileTime.fromMillis(basicFileAttributes
                .lastModifiedTime().toMillis() + 60000);
        Files.setLastModifiedTime(path, newModifiedTime);
        // check if the lastmodifiedtime is changed
        System.out.println("After Changing lastModifiedTime, ");
        System.out.println("Creation Time: " + basicFileAttributes.creationTime());
        System.out.println("Last Access Time: " + basicFileAttributes.lastAccessTime());
        System.out.println("Last Moodified Time: " + basicFileAttributes.lastModifiedTime());
    }

    public static void nioFileOwnerAttributeView(Path path) throws IOException {

        FileOwnerAttributeView fileOwnerAttributeView = Files
                .getFileAttributeView(path, FileOwnerAttributeView.class);
        UserPrincipal userPrincipal = fileOwnerAttributeView.getOwner();
        System.out.println("File Owner: " + userPrincipal.getName());

        FileSystem fileSystem = FileSystems.getDefault();
        UserPrincipalLookupService userPLS = fileSystem.getUserPrincipalLookupService();

        // java.nio.file.attribute.UserPrincipalNotFoundException possible here
        // if the user name passed is not present
        // java.nio.file.AccessDeniedException possible if not enough rights
        UserPrincipal newUserPrincipal = userPLS.lookupPrincipalByName("accountgroup\\username");
        fileOwnerAttributeView.setOwner(newUserPrincipal);

        UserPrincipal changedUserPrincipal = fileOwnerAttributeView.getOwner();
        System.out.println("Changed File Owner: " + changedUserPrincipal);

    }

    public static void nioFileStoreSpace() throws IOException {

        // Loop through the set of FileStores for the default FileSystem
        for (FileStore fileStore : FileSystems.getDefault().getFileStores()) {
            System.out.println("Name: " + fileStore.name());
            System.out.println("Type: " + fileStore.type());
            System.out.println("Total Space (MB): " + fileStore.getTotalSpace() / 1024 / 1024);
            System.out.println("Unallocated Space (MB): " + fileStore.getUnallocatedSpace() / 1024 / 1024);
            System.out.println("Usable Space (MB): " + fileStore.getUsableSpace() / 1024 / 1024);
        }
    }

    // Path path = Paths.get("temp.txt");
// nioUserDefinedFileAttributeView(path);
    public static void nioUserDefinedFileAttributeView(Path path) throws IOException {

        if (File.separatorChar != '\\') {
            System.out.println("This is Windows specific and so exit!");
            return;
        }
        UserDefinedFileAttributeView userDefinedFAView = Files
                .getFileAttributeView(path, UserDefinedFileAttributeView.class);
        List<String> attributeList = userDefinedFAView.list();
        System.out.println("User Defined Attribute List Size Before Adding: " + attributeList.size());

        // set user define attribute
        String attributeName = "foo";
        String attributeValue = "bar";
        userDefinedFAView.write(attributeName, Charset.defaultCharset().encode(attributeValue));

        attributeList = userDefinedFAView.list();
        if (attributeList.size() > 0) {
            for (String attName : attributeList) {
                ByteBuffer attValue = ByteBuffer.allocate(userDefinedFAView
                        .size(attName));
                userDefinedFAView.read(attName, attValue);
                attValue.flip();
                System.out.println("User Defined Attribute Name: " + attName);
                System.out.println("User Defined Attribute Value: "
                        + Charset.defaultCharset().decode(attValue).toString());
            }
        } else {
            System.out.println("User define attribute count should be at least 1"
                            + " as we have set an attribute just now!");
        }

        userDefinedFAView.delete(attributeName);

        // And list the attributes again to check they're back to 0
        attributeList = userDefinedFAView.list();
        System.out.println("User Defined Attribute List Size After Deleting: "
                + attributeList.size());
    }
}
