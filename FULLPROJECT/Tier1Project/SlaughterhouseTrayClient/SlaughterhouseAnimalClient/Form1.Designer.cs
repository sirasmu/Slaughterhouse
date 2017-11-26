namespace SlaughterhouseAnimalClient
{
   partial class TrayClient
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
         this.button1 = new System.Windows.Forms.Button();
         this.groupBox2 = new System.Windows.Forms.GroupBox();
         this.textBox2 = new System.Windows.Forms.TextBox();
         this.checkedListBox1 = new System.Windows.Forms.CheckedListBox();
         this.button2 = new System.Windows.Forms.Button();
         this.label1 = new System.Windows.Forms.Label();
         this.label2 = new System.Windows.Forms.Label();
         this.weight1 = new System.Windows.Forms.TextBox();
         this.weight2 = new System.Windows.Forms.TextBox();
         this.groupBox1.SuspendLayout();
         this.groupBox2.SuspendLayout();
         this.SuspendLayout();
         // 
         // groupBox1
         // 
         this.groupBox1.Controls.Add(this.weight2);
         this.groupBox1.Controls.Add(this.weight1);
         this.groupBox1.Controls.Add(this.label2);
         this.groupBox1.Controls.Add(this.label1);
         this.groupBox1.Controls.Add(this.button2);
         this.groupBox1.Controls.Add(this.checkedListBox1);
         this.groupBox1.Controls.Add(this.button1);
         this.groupBox1.Location = new System.Drawing.Point(12, 12);
         this.groupBox1.Name = "groupBox1";
         this.groupBox1.Size = new System.Drawing.Size(706, 214);
         this.groupBox1.TabIndex = 0;
         this.groupBox1.TabStop = false;
         this.groupBox1.Text = "Request uncut animals";
         // 
         // button1
         // 
         this.button1.Location = new System.Drawing.Point(350, 180);
         this.button1.Name = "button1";
         this.button1.Size = new System.Drawing.Size(75, 23);
         this.button1.TabIndex = 0;
         this.button1.Text = "Request";
         this.button1.UseVisualStyleBackColor = true;
         this.button1.Click += new System.EventHandler(this.button1_Click);
         // 
         // groupBox2
         // 
         this.groupBox2.Controls.Add(this.textBox2);
         this.groupBox2.Location = new System.Drawing.Point(12, 232);
         this.groupBox2.Name = "groupBox2";
         this.groupBox2.Size = new System.Drawing.Size(706, 71);
         this.groupBox2.TabIndex = 1;
         this.groupBox2.TabStop = false;
         this.groupBox2.Text = "Response";
         // 
         // textBox2
         // 
         this.textBox2.BackColor = System.Drawing.SystemColors.ControlDark;
         this.textBox2.Location = new System.Drawing.Point(10, 32);
         this.textBox2.Name = "textBox2";
         this.textBox2.Size = new System.Drawing.Size(690, 20);
         this.textBox2.TabIndex = 2;
         // 
         // checkedListBox1
         // 
         this.checkedListBox1.FormattingEnabled = true;
         this.checkedListBox1.Location = new System.Drawing.Point(10, 20);
         this.checkedListBox1.Name = "checkedListBox1";
         this.checkedListBox1.Size = new System.Drawing.Size(415, 154);
         this.checkedListBox1.TabIndex = 1;
         this.checkedListBox1.ItemCheck += new System.Windows.Forms.ItemCheckEventHandler(this.checkedListBox1_ItemCheck);
         // 
         // button2
         // 
         this.button2.Location = new System.Drawing.Point(583, 180);
         this.button2.Name = "button2";
         this.button2.Size = new System.Drawing.Size(117, 23);
         this.button2.TabIndex = 2;
         this.button2.Text = "Send parts weight";
         this.button2.UseVisualStyleBackColor = true;
         this.button2.Click += new System.EventHandler(this.button2_Click);
         // 
         // label1
         // 
         this.label1.AutoSize = true;
         this.label1.Location = new System.Drawing.Point(448, 34);
         this.label1.Name = "label1";
         this.label1.Size = new System.Drawing.Size(74, 13);
         this.label1.TabIndex = 3;
         this.label1.Text = "Weight part 1:";
         // 
         // label2
         // 
         this.label2.AutoSize = true;
         this.label2.Location = new System.Drawing.Point(448, 63);
         this.label2.Name = "label2";
         this.label2.Size = new System.Drawing.Size(74, 13);
         this.label2.TabIndex = 4;
         this.label2.Text = "Weight part 2:";
         // 
         // weight1
         // 
         this.weight1.Location = new System.Drawing.Point(528, 31);
         this.weight1.Name = "weight1";
         this.weight1.Size = new System.Drawing.Size(172, 20);
         this.weight1.TabIndex = 5;
         // 
         // weight2
         // 
         this.weight2.Location = new System.Drawing.Point(528, 60);
         this.weight2.Name = "weight2";
         this.weight2.Size = new System.Drawing.Size(172, 20);
         this.weight2.TabIndex = 6;
         // 
         // TrayClient
         // 
         this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
         this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
         this.ClientSize = new System.Drawing.Size(730, 315);
         this.Controls.Add(this.groupBox2);
         this.Controls.Add(this.groupBox1);
         this.Name = "TrayClient";
         this.Text = "TrayClient";
         this.groupBox1.ResumeLayout(false);
         this.groupBox1.PerformLayout();
         this.groupBox2.ResumeLayout(false);
         this.groupBox2.PerformLayout();
         this.ResumeLayout(false);

      }

      #endregion

      private System.Windows.Forms.GroupBox groupBox1;
      private System.Windows.Forms.Button button1;
      private System.Windows.Forms.GroupBox groupBox2;
      private System.Windows.Forms.TextBox textBox2;
      private System.Windows.Forms.CheckedListBox checkedListBox1;
      private System.Windows.Forms.Button button2;
      private System.Windows.Forms.TextBox weight2;
      private System.Windows.Forms.TextBox weight1;
      private System.Windows.Forms.Label label2;
      private System.Windows.Forms.Label label1;
   }
}

