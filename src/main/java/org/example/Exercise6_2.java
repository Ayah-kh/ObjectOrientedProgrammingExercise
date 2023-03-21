package org.example;

class PhotoAlbum {
    private int numberOfPages;

    public PhotoAlbum(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public PhotoAlbum() {
        this.numberOfPages = 16;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}

class BigPhotoAlbum{
    private int numberOfPages;

    public BigPhotoAlbum() {
        this.numberOfPages = 64;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}

public class Exercise6_2 {

    public static void main(String[] args) {

        PhotoAlbum photoAlbum=new PhotoAlbum();
        System.out.println(photoAlbum.getNumberOfPages());

        PhotoAlbum photoAlbum1=new PhotoAlbum(24);
        System.out.println(photoAlbum1.getNumberOfPages());

        BigPhotoAlbum bigPhotoAlbum=new BigPhotoAlbum();
        System.out.println(bigPhotoAlbum.getNumberOfPages());

    }
}
