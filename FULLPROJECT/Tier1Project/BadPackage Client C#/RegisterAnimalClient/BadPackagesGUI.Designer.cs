namespace RegisterAnimalClient
{
    partial class BadPackagesGUI
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.titleLabel = new System.Windows.Forms.Label();
            this.packageId = new System.Windows.Forms.Label();
            this.idtextbox = new System.Windows.Forms.TextBox();
            this.showallbutton = new System.Windows.Forms.Button();
            this.resultlist = new System.Windows.Forms.ListBox();
            this.label1 = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // titleLabel
            // 
            this.titleLabel.AutoSize = true;
            this.titleLabel.Location = new System.Drawing.Point(28, 20);
            this.titleLabel.Name = "titleLabel";
            this.titleLabel.Size = new System.Drawing.Size(251, 20);
            this.titleLabel.TabIndex = 0;
            this.titleLabel.Text = "FIND ALL PACKAGES RELATED";
            // 
            // packageId
            // 
            this.packageId.AutoSize = true;
            this.packageId.Location = new System.Drawing.Point(28, 77);
            this.packageId.Name = "packageId";
            this.packageId.Size = new System.Drawing.Size(135, 20);
            this.packageId.TabIndex = 1;
            this.packageId.Text = "Insert package id:";
            // 
            // idtextbox
            // 
            this.idtextbox.Location = new System.Drawing.Point(32, 100);
            this.idtextbox.Name = "idtextbox";
            this.idtextbox.Size = new System.Drawing.Size(583, 26);
            this.idtextbox.TabIndex = 2;
            // 
            // showallbutton
            // 
            this.showallbutton.BackColor = System.Drawing.SystemColors.Highlight;
            this.showallbutton.ForeColor = System.Drawing.SystemColors.ButtonHighlight;
            this.showallbutton.Location = new System.Drawing.Point(413, 133);
            this.showallbutton.Name = "showallbutton";
            this.showallbutton.Size = new System.Drawing.Size(202, 37);
            this.showallbutton.TabIndex = 3;
            this.showallbutton.Text = "SHOW ALL";
            this.showallbutton.UseVisualStyleBackColor = false;
            this.showallbutton.Click += new System.EventHandler(this.showallbutton_Click);
            // 
            // resultlist
            // 
            this.resultlist.FormattingEnabled = true;
            this.resultlist.ItemHeight = 20;
            this.resultlist.Location = new System.Drawing.Point(32, 204);
            this.resultlist.Name = "resultlist";
            this.resultlist.Size = new System.Drawing.Size(583, 224);
            this.resultlist.TabIndex = 4;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(32, 178);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(67, 20);
            this.label1.TabIndex = 5;
            this.label1.Text = "Results:";
            // 
            // Form1
            // 
            this.ClientSize = new System.Drawing.Size(653, 456);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.resultlist);
            this.Controls.Add(this.showallbutton);
            this.Controls.Add(this.idtextbox);
            this.Controls.Add(this.packageId);
            this.Controls.Add(this.titleLabel);
            this.Name = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.TextBox textBox1;
        private System.Windows.Forms.Label titleLabel;
        private System.Windows.Forms.Label packageId;
        private System.Windows.Forms.TextBox idtextbox;
        private System.Windows.Forms.Button showallbutton;
        private System.Windows.Forms.ListBox resultlist;
        private System.Windows.Forms.Label label1;
    }
}

