package JavaP158;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class JavaP58DemoJFame extends JFrame implements ActionListener {
    // 将按钮对象定义到成员位置,以便为了调用
    JButton yesBut = new JButton("帅炸了");
    JButton midBut = new JButton("我错了");
    JButton badBut = new JButton("好丑");
    // 获取系统runtime对象

    public JavaP58DemoJFame() {
        intitJFame();
        initView();
        // 设置显示
        setVisible(true);
    }

    public void intitJFame() {
        // 设置宽高
        setSize(500, 600);
        // 设置标题
        setTitle("恶搞基友");
        // 设置关闭模式
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        // 设置一直在最上面
        setAlwaysOnTop(true);
        // 设置居中
        setLocationRelativeTo(null);
        // 取消默认位置
        setLayout(null);
    }

    public void initView() {
        getContentPane().removeAll();
        JLabel test = new JLabel("你觉得我帅吗");

        // System.out.println(test.getText());
        test.setBounds(200, 150, 300, 50);
        // 设置按钮尺寸和位置
        yesBut.setBounds(100, 250, 300, 50);
        midBut.setBounds(200, 325, 100, 30);
        badBut.setBounds(160, 400, 180, 30);
        // 绑定事件监听
        yesBut.addActionListener(this);
        midBut.addActionListener(this);
        badBut.addActionListener(this);
        // 将按钮添加到界面中
        getContentPane().add(yesBut);
        getContentPane().add(midBut);
        getContentPane().add(badBut);
        // 添加提示语
        getContentPane().add(test);
        getContentPane().repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // 获取是哪个对象
        Object object = e.getSource();
        if (object == yesBut) {
            showDiwlog("谢谢夸奖");
        } else if (object == midBut) {
            showDiwlog("我错了");
            try {
                // 执行系统cmd程序
                Runtime.getRuntime().exec(new String[] { "shutdown", "-a" });
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        } else if (object == badBut) {
            showDiwlog("你完了");
            try {
                // 执行系统cmd程序
                Runtime.getRuntime().exec(new String[] { "shutdown", "-s", "-t", "100" });
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        }
    }

    public void showDiwlog(String context) {// 跳出弹框
        JDialog jdialog = new javax.swing.JDialog();
        // 设置弹窗尺寸
        jdialog.setSize(200, 150);
        // 始终再最上面
        jdialog.setAlwaysOnTop(true);
        // 设置一直居中
        jdialog.setLocationRelativeTo(null);
        // 弹窗不关闭就无法操作下面的界面
        jdialog.setModal(true);
        // 设置描述,添加到弹窗里面
        JLabel warn = new JLabel(context);
        // 设置描述大小
        warn.setBounds(0, 0, 200, 150);
        // 将弹窗添加到弹窗容器内
        jdialog.getContentPane().add(warn);
        // 让弹窗显示
        jdialog.setVisible(true);
    }

}
