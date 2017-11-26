namespace SlaughterhouseAnimalClient
{
   partial class PackClient
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
         this.requestLEG = new System.Windows.Forms.Button();
         this.registerPackage = new System.Windows.Forms.Button();
         this.checkedListBox1 = new System.Windows.Forms.CheckedListBox();
         this.requestHAM = new System.Windows.Forms.Button();
         this.groupBox2 = new System.Windows.Forms.GroupBox();
         this.textBox2 = new System.Windows.Forms.TextBox();
         this.checkedListBox2 = new System.Windows.Forms.CheckedListBox();
         this.groupBox1.SuspendLayout();
         this.groupBox2.SuspendLayout();
         this.SuspendLayout();
         // 
         // groupBox1
         // 
         this.groupBox1.Controls.Add(this.checkedListBox2);
         this.groupBox1.Controls.Add(this.requestLEG);
         this.groupBox1.Controls.Add(this.registerPackage);
         this.groupBox1.Controls.Add(this.checkedListBox1);
         this.groupBox1.Controls.Add(this.requestHAM);
         this.groupBox1.Location = new System.Drawing.Point(12, 12);
         this.groupBox1.Name = "groupBox1";
         this.groupBox1.Size = new System.Drawing.Size(706, 214);
         this.groupBox1.TabIndex = 0;
         this.groupBox1.TabStop = false;
         this.groupBox1.Text = "Pack ready trays";
         // 
         // requestLEG
         // 
         this.requestLEG.Location = new System.Drawing.Point(70, 180);
         this.requestLEG.Name = "requestLEG";
         this.requestLEG.Size = new System.Drawing.Size(138, 23);
         this.requestLEG.TabIndex = 7;
         this.requestLEG.Text = "Request LEG trays";
         this.requestLEG.UseVisualStyleBackColor = true;
         this.requestLEG.Click += new System.EventHandler(this.requestLEG_Click);
         // 
         // registerPackage
         // 
         this.registerPackage.Location = new System.Drawing.Point(583, 180);
         this.registerPackage.Name = "registerPackage";
         this.registerPackage.Size = new System.Drawing.Size(117, 23);
         this.registerPackage.TabIndex = 2;
         this.registerPackage.Text = "Register package";
         this.registerPackage.UseVisualStyleBackColor = true;
         this.registerPackage.Click += new System.EventHandler(this.registerPackage_Click);
         // 
         // checkedListBox1
         // 
         this.checkedListBox1.FormattingEnabled = true;
         this.checkedListBox1.Location = new System.Drawing.Point(10, 20);
         this.checkedListBox1.Name = "checkedListBox1";
         this.checkedListBox1.Size = new System.Drawing.Size(342, 154);
         this.checkedListBox1.TabIndex = 1;
         this.checkedListBox1.ItemCheck += new System.Windows.Forms.ItemCheckEventHandler(this.checkedListBox1_ItemCheck);
         // 
         // requestHAM
         // 
         this.requestHAM.Location = new System.Drawing.Point(214, 180);
         this.requestHAM.Name = "requestHAM";
         this.requestHAM.Size = new System.Drawing.Size(138, 23);
         this.requestHAM.TabIndex = 0;
         this.requestHAM.Text = "Request HAM trays";
         this.requestHAM.UseVisualStyleBackColor = true;
         this.requestHAM.Click += new System.EventHandler(this.requestHAM_Click);
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
         // checkedListBox2
         // 
         this.checkedListBox2.FormattingEnabled = true;
         this.checkedListBox2.Location = new System.Drawing.Point(358, 19);
         this.checkedListBox2.Name = "checkedListBox2";
         this.checkedListBox2.Size = new System.Drawing.Size(342, 154);
         this.checkedListBox2.TabIndex = 8;
         // 
         // PackClient
         // 
         this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
         this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
         this.ClientSize = new System.Drawing.Size(730, 315);
         this.Controls.Add(this.groupBox2);
         this.Controls.Add(this.groupBox1);
         this.Name = "PackClient";
         this.Text = "PackClient";
         this.groupBox1.ResumeLayout(false);
         this.groupBox2.ResumeLayout(false);
         this.groupBox2.PerformLayout();
         this.ResumeLayout(false);

      }

      #endregion

      private System.Windows.Forms.GroupBox groupBox1;
      private System.Windows.Forms.Button requestHAM;
      private System.Windows.Forms.GroupBox groupBox2;
      private System.Windows.Forms.TextBox textBox2;
      private System.Windows.Forms.CheckedListBox checkedListBox1;
      private System.Windows.Forms.Button registerPackage;
      private System.Windows.Forms.Button requestLEG;
      private System.Windows.Forms.CheckedListBox checkedListBox2;
   }
}

