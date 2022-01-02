/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.park.parkinglot.common;

import java.io.Serializable;

/**
 *
 * @author Larisa
 */
public class PhotoDetails implements Serializable {

    private Integer id;
    private String filename;
    private String fileType;
    private byte[] fileContent;

    public PhotoDetails(Integer id, String filename, String fileType, byte[] fileContent) {
        this.id = id;
        this.filename = filename;
        this.fileType = fileType;
        this.fileContent = fileContent;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @return the filename
     */
    public String getFilename() {
        return filename;
    }

    /**
     * @return the fileType
     */
    public String getFileType() {
        return fileType;
    }

    /**
     * @return the fileContent
     */
    public byte[] getFileContent() {
        return fileContent;
    }

}
