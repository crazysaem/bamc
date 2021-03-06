/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mygame;

//Implementation by Michael Tague
//http://snippets.dzone.com/posts/show/93

public class ByteIntConvert {
    
    public static byte[] intToByteArray(int value) {
        return new byte[] {
                (byte)(value >>> 24),
                (byte)(value >>> 16),
                (byte)(value >>> 8),
                (byte)value};
    }

    public static int byteArrayToInt(byte [] b) {
        return (b[0] << 24)
                + ((b[1] & 0xFF) << 16)
                + ((b[2] & 0xFF) << 8)
                + (b[3] & 0xFF);
    }
}
