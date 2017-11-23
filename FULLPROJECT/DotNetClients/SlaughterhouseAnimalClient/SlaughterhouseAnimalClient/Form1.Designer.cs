namespace SlaughterhouseAnimalClient
{
   partial class AnimalClient
   {
      /// <summary>
      /// Required designer variable.
      /// </summary>
      private System.ComponentModel.IContainer components = null;

      /// <summary>
      /// Clean up any resources being used.
      /// </summary>
      /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
      protected override void Dispose( bool disposing )
      {
         if( disposing && ( components != null ) )
         {
            components.Dispose();
         }
         base.Dispose( disposing );
      }

      #region Windows Form Designer generated code

      /// <summary>
      /// Required method for Designer support - do not modify
      /// the contents of this method with the code editor.
      /// </summary>
      private void InitializeComponent()
      {
         this.groupBox1 = new System.Windows.Forms.GroupBox();
         this.textBox5 = new System.Windows.Forms.TextBox();
         this.label5 = new System.Windows.Forms.Label();
         this.textBox1 = new System.Windows.Forms.TextBox();
         this.label1 = new System.Windows.Forms.Label();
         this.button1 = new System.Windows.Forms.Button();
         this.groupBox2 = new System.Windows.Forms.GroupBox();
         this.textBox2 = new System.Windows.Forms.TextBox();
         this.groupBox1.SuspendLayout();
         this.groupBox2.SuspendLayout();
         this.SuspendLayout();
         // 
         // groupBox1
         // 
         this.groupBox1.Controls.Add(this.textBox5);
         this.groupBox1.Controls.Add(this.label5);
         this.groupBox1.Controls.Add(this.textBox1);
         this.groupBox1.Controls.Add(this.label1);
         this.groupBox1.Controls.Add(this.button1);
         this.groupBox1.Location = new System.Drawing.Point(12, 12);
         this.groupBox1.Name = "groupBox1";
         this.groupBox1.Size = new System.Drawing.Size(189, 129);
         this.groupBox1.TabIndex = 0;
         this.groupBox1.TabStop = false;
         this.groupBox1.Text = "Animal Registration";
         // 
         // textBox5
         // 
         this.textBox5.Location = new System.Drawing.Point(71, 63);
         this.textBox5.Name = "textBox5";
         this.textBox5.Size = new System.Drawing.Size(100, 20);
         this.textBox5.TabIndex = 4;
         // 
         // label5
         // 
         this.label5.AutoSize = true;
         this.label5.Location = new System.Drawing.Point(7, 66);
         this.label5.Name = "label5";
         this.label5.Size = new System.Drawing.Size(47, 13);
         this.label5.TabIndex = 3;
         this.label5.Text = "Weight: ";
         // 
         // textBox1
         // 
         this.textBox1.Location = new System.Drawing.Point(71, 34);
         this.textBox1.Name = "textBox1";
         this.textBox1.Size = new System.Drawing.Size(100, 20);
         this.textBox1.TabIndex = 2;
         // 
         // label1
         // 
         this.label1.AutoSize = true;
         this.label1.Location = new System.Drawing.Point(7, 39);
         this.label1.Name = "label1";
         this.label1.Size = new System.Drawing.Size(50, 13);
         this.label1.TabIndex = 1;
         this.label1.Text = "Farm ID: ";
         // 
         // button1
         // 
         this.button1.Location = new System.Drawing.Point(96, 89);
         this.button1.Name = "button1";
         this.button1.Size = new System.Drawing.Size(75, 23);
         this.button1.TabIndex = 0;
         this.button1.Text = "Register";
         this.button1.UseVisualStyleBackColor = true;
         // 
         // groupBox2
         // 
         this.groupBox2.Controls.Add(this.textBox2);
         this.groupBox2.Location = new System.Drawing.Point(12, 147);
         this.groupBox2.Name = "groupBox2";
         this.groupBox2.Size = new System.Drawing.Size(189, 143);
         this.groupBox2.TabIndex = 1;
         this.groupBox2.TabStop = false;
         this.groupBox2.Text = "Response";
         // 
         // textBox2
         // 
         this.textBox2.BackColor = System.Drawing.SystemColors.ControlDark;
         this.textBox2.Location = new System.Drawing.Point(10, 32);
         this.textBox2.Name = "textBox2";
         this.textBox2.Size = new System.Drawing.Size(161, 20);
         this.textBox2.TabIndex = 2;
         // 
         // AnimalClient
         // 
         this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
         this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
         this.ClientSize = new System.Drawing.Size(212, 302);
         this.Controls.Add(this.groupBox2);
         this.Controls.Add(this.groupBox1);
         this.Name = "AnimalClient";
         this.Text = "AnimalClient";
         this.groupBox1.ResumeLayout(false);
         this.groupBox1.PerformLayout();
         this.groupBox2.ResumeLayout(false);
         this.groupBox2.PerformLayout();
         this.ResumeLayout(false);

      }

      #endregion

      private System.Windows.Forms.GroupBox groupBox1;
      private System.Windows.Forms.Label label1;
      private System.Windows.Forms.Button button1;
      private System.Windows.Forms.TextBox textBox1;
      private System.Windows.Forms.GroupBox groupBox2;
      private System.Windows.Forms.TextBox textBox5;
      private System.Windows.Forms.Label label5;
      private System.Windows.Forms.TextBox textBox2;
   }
}

