import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;

public class HesapMakinesi extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField birinciSayi;
	private JTextField ikinciSayi;
	private JTextField sonuc;
	

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HesapMakinesi frame = new HesapMakinesi();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	


	public HesapMakinesi() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 644, 449);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblNewLabel = new JLabel("birinci sayı");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(159, 33, 104, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ikinci sayı");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(159, 87, 104, 21);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Sonuç");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(159, 157, 79, 27);
		contentPane.add(lblNewLabel_2);
		
		birinciSayi = new JTextField();
		birinciSayi.setBounds(282, 40, 96, 19);
		contentPane.add(birinciSayi);
		birinciSayi.setColumns(10);
		
		ikinciSayi = new JTextField();
		ikinciSayi.setBounds(282, 91, 96, 19);
		contentPane.add(ikinciSayi);
		ikinciSayi.setColumns(10);
		
		sonuc = new JTextField();
		sonuc.setEditable(false);
		sonuc.setBounds(282, 164, 96, 19);
		contentPane.add(sonuc);
		sonuc.setColumns(10);
		
		JButton toplama = new JButton("+");
		toplama.setBounds(159, 285, 85, 21);
		contentPane.add(toplama);
		
        toplama.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	toplamaActionPerformed(evt);
            }
        });

		
		JButton cıkarma = new JButton("-");
		cıkarma.setBounds(328, 285, 85, 21);
		contentPane.add(cıkarma);
		
		cıkarma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	cıkarmaActionPerformed(evt);
            }
        });
		
		JButton carpma = new JButton("x");
		carpma.setBounds(159, 337, 85, 21);
		contentPane.add(carpma);
		
		carpma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	carpmaActionPerformed(evt);
            }
        });
		
		JButton bölme = new JButton("/");
		bölme.setBounds(328, 337, 85, 21);
		contentPane.add(bölme);
		
		bölme.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	bölmeActionPerformed(evt);
            }
        });
		
		
		
	}
	private void toplamaActionPerformed(ActionEvent evt) {
        int birinci_sayi =  Integer.valueOf(this.birinciSayi.getText());
        int ikinci_sayi =  Integer.valueOf(this.ikinciSayi.getText());
        
        
        sonuc.setText(String.valueOf(birinci_sayi+ikinci_sayi));
        
        
    }
	private void cıkarmaActionPerformed(ActionEvent evt) {
        int birinci_sayi =  Integer.valueOf(this.birinciSayi.getText());
        int ikinci_sayi =  Integer.valueOf(this.ikinciSayi.getText());
        
        
        sonuc.setText(String.valueOf(birinci_sayi-ikinci_sayi));
        
        
    }
	private void carpmaActionPerformed(ActionEvent evt) {
        int birinci_sayi =  Integer.valueOf(this.birinciSayi.getText());
        int ikinci_sayi =  Integer.valueOf(this.ikinciSayi.getText());
        
        
        sonuc.setText(String.valueOf(birinci_sayi*ikinci_sayi));
        
        
    }
	private void bölmeActionPerformed(ActionEvent evt) {
        int birinci_sayi =  Integer.valueOf(this.birinciSayi.getText());
        int ikinci_sayi =  Integer.valueOf(this.ikinciSayi.getText());
        
        
        sonuc.setText(String.valueOf(birinci_sayi/ikinci_sayi));
        
        
    }
	
}
