/*
UNIVERSIDAD NACIONAL DE COSTA RICA
EIF-206  -  PROGRAMACIÓN III
ESTUDIANTES: JOEL ZAMORA Y DIEGO JIMÉNEZ
PROFESOR: JOSE SÁNCHEZ SALAZAR
*/

package sistema.de.facturación.principal;
import java.util.Observable;

public class Interfaz extends javax.swing.JFrame implements java.util.Observer {
    public Interfaz() {
        control = null;
        model = null;
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jButtonClientes = new javax.swing.JButton();
        jButtonFacturas = new javax.swing.JButton();
        jButtonProducto = new javax.swing.JButton();
        jButtonEmpresa = new javax.swing.JButton();
        jLabelEmpresa = new javax.swing.JLabel();
        jLabelClientes = new javax.swing.JLabel();
        jLabelProductos = new javax.swing.JLabel();
        jLabelFacturas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Proyecto");

        jLabelTitulo.setBackground(new java.awt.Color(204, 255, 102));
        jLabelTitulo.setFont(new java.awt.Font("Bell MT", 0, 48)); // NOI18N
        jLabelTitulo.setText("         Sistema de productos y facturación");
        jLabelTitulo.setToolTipText("");
        jLabelTitulo.setOpaque(true);

        jButtonClientes.setBackground(new java.awt.Color(255, 255, 153));
        jButtonClientes.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        jButtonClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/de/facturación/principal/Clientes.png"))); // NOI18N

        jButtonFacturas.setBackground(new java.awt.Color(204, 255, 0));
        jButtonFacturas.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jButtonFacturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/de/facturación/principal/Factura.jpg"))); // NOI18N

        jButtonProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/de/facturación/principal/productos.jpg"))); // NOI18N

        jButtonEmpresa.setBackground(new java.awt.Color(204, 255, 51));
        jButtonEmpresa.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        jButtonEmpresa.setForeground(new java.awt.Color(51, 51, 51));
        jButtonEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/de/facturación/principal/Empresa.jpg"))); // NOI18N
        jButtonEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEmpresaActionPerformed(evt);
            }
        });

        jLabelEmpresa.setBackground(new java.awt.Color(204, 255, 0));
        jLabelEmpresa.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabelEmpresa.setText("Empresa");
        jLabelEmpresa.setOpaque(true);

        jLabelClientes.setBackground(new java.awt.Color(204, 255, 0));
        jLabelClientes.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabelClientes.setText("Clientes");
        jLabelClientes.setOpaque(true);

        jLabelProductos.setBackground(new java.awt.Color(204, 255, 0));
        jLabelProductos.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabelProductos.setText("Productos");
        jLabelProductos.setToolTipText("");
        jLabelProductos.setOpaque(true);

        jLabelFacturas.setBackground(new java.awt.Color(204, 255, 0));
        jLabelFacturas.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabelFacturas.setText("Facturas");
        jLabelFacturas.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelProductos)
                    .addComponent(jLabelEmpresa))
                .addGap(139, 139, 139)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelClientes)
                    .addComponent(jLabelFacturas)
                    .addComponent(jButtonClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonFacturas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                    .addComponent(jButtonClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmpresa)
                    .addComponent(jLabelClientes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                    .addComponent(jButtonFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelProductos)
                    .addComponent(jLabelFacturas))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEmpresaActionPerformed

    }//GEN-LAST:event_jButtonEmpresaActionPerformed
    
    public Control getControl(){
        return control;
    }
    
    public Model getModel(){
        return model;
    }
    
    public void setControl(Control control){
        this.control = control;
    }
    
    public void setModel(Model model){
        this.model = model;
        model.addObserver(this);
    }
    
    private Control control;
    private Model model;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClientes;
    private javax.swing.JButton jButtonEmpresa;
    private javax.swing.JButton jButtonFacturas;
    private javax.swing.JButton jButtonProducto;
    private javax.swing.JLabel jLabelClientes;
    private javax.swing.JLabel jLabelEmpresa;
    private javax.swing.JLabel jLabelFacturas;
    private javax.swing.JLabel jLabelProductos;
    private javax.swing.JLabel jLabelTitulo;
    // End of variables declaration//GEN-END:variables
    
    @Override
    public void update(Observable o, Object arg) {
    }
}