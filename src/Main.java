import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.*;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;
import javax.swing.JFrame;

public class Main extends JFrame implements GLEventListener {
    private static final long serialVersionUID = 1L;

    private int width = 600;
    private int height = 600;

    public static void main(String[] args) {
        Main main = new Main();
    }

    public Main() {
        super("Minimal OpenGL");
        GLProfile profile = GLProfile.get(GLProfile.GL2);
        GLCapabilities capabilities = new GLCapabilities(profile);

        GLCanvas canvas = new GLCanvas(capabilities);
        canvas.addGLEventListener(this);

        this.setName("3D Renderer");
        this.getContentPane().add(canvas);
        this.setSize(width, height);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(true);
        canvas.requestFocusInWindow();


        Plane p = new Plane();
       // p.printTest();
    }

    @Override
    public void init(GLAutoDrawable glAutoDrawable) {
        GL2 gl = glAutoDrawable.getGL().getGL2();
        //               Red      Green    Blue   Alpha
        gl.glClearColor(0.18f, 0.18f, 0.18f, 1f);
    }

    @Override
    public void dispose(GLAutoDrawable glAutoDrawable) {

    }

    @Override
    public void display(GLAutoDrawable glAutoDrawable) {
        GL2 gl = glAutoDrawable.getGL().getGL2();
        gl.glClear(GL4.GL_COLOR_BUFFER_BIT | GL4.GL_DEPTH_BUFFER_BIT);

        gl.glColor3f(1.0f, 1.0f, 1.0f );



//        gl.glBegin(GL2.GL_POLYGON);
//        gl.glVertex3f( -0.5f, -0.5f, 0.0f );
//        gl.glVertex3f( -0.5f, 0.5f, 0.0f );
//        gl.glVertex3f( 0.5f, 0.5f, 0.0f );
//        gl.glVertex3f( 0.5f, -0.5f, 0.0f );
//        gl.glEnd();

//        gl.glLineWidth(2f);
//        gl.glBegin(GL2.GL_LINES);

        //left and right lines

//        //bot left
//        gl.glVertex3f( -0.5f, -0.5f, 0.0f );
//        //top left
//        gl.glVertex3f( -0.5f, 0.5f, 0.0f );
//
//        //bot right
//        gl.glVertex3f( 0.5f, -0.5f, 0.0f );
//        //top right
//        gl.glVertex3f( 0.5f, 0.5f, 0.0f );
//
//
//        //top and bottom lines
//
//        //bot left
//        gl.glVertex3f( -0.5f, -0.5f, 0.0f );
//        //bot right
//        gl.glVertex3f( 0.5f, -0.5f, 0.0f );
//
//
//        //top left
//        gl.glVertex3f( -0.5f, 0.5f, 0.0f );
//        //top right
//        gl.glVertex3f( 0.5f, 0.5f, 0.0f );

        //gl.glEnd();

        //gl.glFlush();

        Cube cu = new Cube();
        Scene s = new Scene(cu);
        Camera c = new Camera();
        c.draw(s, glAutoDrawable);


    }

    @Override
    public void reshape(GLAutoDrawable glAutoDrawable, int i, int i1, int i2, int i3) {

    }
}
