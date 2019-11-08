package com.smeloniot.stensaxpase;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public enum Selection {
    ROCK,
    PAPER,
    SCISSORS
    ;

    private short[][] matrix = new short[][] {
            new short[] {
                0, 2, 1
            },
            new short[] {
                1, 0, 2
            },
            new short[] {
                2, 1, 0
            }
    };

    public short compare(Selection other) {
        short sel1 = (short) this.ordinal();
        short sel2 = (short) other.ordinal();

        return matrix[sel1][sel2];
    }

    public BufferedImage getImage() throws IOException {
        return ImageIO.read(Main.class.getResourceAsStream(String.format("/images/%s.png", this.toString())));
    }
}
