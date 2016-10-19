package learnjogl.drawline;

import javax.media.opengl.GL2;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.GLProfile;
import javax.media.opengl.awt.GLCanvas;

import javax.swing.JFrame;

public class Rhombus implements GLEventListener {

   @Override
   public void display( GLAutoDrawable drawable ) {
      final GL2 gl = drawable.getGL().getGL2();
      
      //edge1  
      gl.glBegin( GL2.GL_LINES );
      gl.glVertex3f( 0.0f,0.75f,0 );
      gl.glVertex3f( -0.75f,0f,0 );
      gl.glEnd();
      
      //edge2
      gl.glBegin( GL2.GL_LINES );
      gl.glVertex3f( -0.75f,0f,0 );
      gl.glVertex3f( 0f,-0.75f, 0 );
      gl.glEnd();
      
      //edge3
      gl.glBegin( GL2.GL_LINES );
      gl.glVertex3f( 0f,-0.75f, 0 );
      gl.glVertex3f( 0.75f,0f, 0 );
      gl.glEnd();
      
      //edge4
      gl.glBegin( GL2.GL_LINES );
      gl.glVertex3f( 0.75f,0f, 0 );
      gl.glVertex3f( 0.0f,0.75f,0 );
      gl.glEnd();
      gl.glFlush();
   }
	
   @Override
   public void dispose( GLAutoDrawable arg0 ) {
      //method body
   }
	
   @Override
   public void init(GLAutoDrawable arg0 ) {
      // method body
   }
	
   @Override
   public void reshape( GLAutoDrawable arg0, int arg1, int arg2, int arg3, int arg4 ) {
      // method body
   }
	
   public static void main( String[] args ) {
	
      //getting the capabilities object of GL2 profile
      final GLProfile profile = GLProfile.get( GLProfile.GL2 );
      GLCapabilities capabilities = new GLCapabilities(profile);
      
      // The canvas
      final GLCanvas glcanvas = new GLCanvas( capabilities );
      Rhombus rhombus = new Rhombus();
      glcanvas.addGLEventListener( rhombus );
      glcanvas.setSize( 400, 400 );
      
      //creating frame
      final JFrame frame = new JFrame ( "Rhombus" );
      
      //adding canvas to frame
      frame.getContentPane().add( glcanvas );
      frame.setSize(frame.getContentPane().getPreferredSize() );
      frame.setVisible( true );
   }
	
}