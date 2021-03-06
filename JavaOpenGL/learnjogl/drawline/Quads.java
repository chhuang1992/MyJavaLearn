package learnjogl.drawline;

import javax.media.opengl.GL2;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.GLProfile;
import javax.media.opengl.awt.GLCanvas;

import javax.swing.JFrame;

public class Quads implements GLEventListener {

   @Override
   public void display(GLAutoDrawable drawable) {

	   final GL2 gl = drawable.getGL().getGL2();
	   
	   gl.glBegin(GL2.GL_QUADS);
	   
	   gl.glVertex3f( 0.0f,0.75f,0);
	   gl.glVertex3f(-0.75f,0f,0);
	   gl.glVertex3f(0f,-0.75f,0);
	   gl.glVertex3f(0.75f,0f,0);
	   
	   gl.glEnd();
	}
   
   @Override
   public void dispose(GLAutoDrawable arg0) {
      //method body
   }
   
   @Override
   public void init(GLAutoDrawable arg0) {
      // method body
   }
   
   @Override
   public void reshape(GLAutoDrawable arg0, int arg1, int arg2, int arg3, int arg4) {
      // method body
   }
   
   public static void main(String[] args) {
   
      //getting the capabilities object of GL2 profile
      final GLProfile profile = GLProfile.get(GLProfile.GL2);
      GLCapabilities capabilities = new GLCapabilities(profile);
      
      // The canvas
      final GLCanvas glcanvas = new GLCanvas(capabilities);
      Quads r = new Quads();
      glcanvas.addGLEventListener(r);
      glcanvas.setSize(400, 400);
      
      //creating frame
      final JFrame frame = new JFrame ("Triangle");
      
      //adding canvas to frame
      frame.getContentPane().add(glcanvas);
            
      frame.setSize(frame.getContentPane().getPreferredSize());
      frame.setVisible(true);
      
   }//end of main
	
}//end of classimport javax.media.opengl.GL2;