
import javax.swing.JFrame;
import sun.java2d.pipe.hw.ExtendedBufferCapabilities;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bagas Wirawan
 */
public class frameutama 
    extends JFrame {
    public frameutama(){
        this.setSize(300, 300);
        this.setLocation(200, 200);
       // this.setDefaultCloseOperation(Jframe.EXIT_ON_CLOSE);
        
    }
    public void tampil(){
        this.setVisible(true);
    }
    public void tampil(String nama){
        this.setTitle(nama);
        this.setVisible(true);
    }
}
