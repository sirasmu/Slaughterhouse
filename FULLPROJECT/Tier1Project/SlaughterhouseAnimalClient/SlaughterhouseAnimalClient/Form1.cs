using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Net;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace SlaughterhouseAnimalClient
{

   public partial class AnimalClient : Form
   {
      private Slaughterhouse.ISlaughterhouseWebService webService = new Slaughterhouse.ISlaughterhouseWebService();

      public AnimalClient()
      {
         InitializeComponent();
      }

      private void button1_Click( object sender, EventArgs e )
      {
         try
         {
            textBox2.Text = webService.readIncomingMessage(string.Format("REGISTER_ANIMAL {0}", textBox1.Text));
         }
         catch (Exception ex)
         {
            textBox2.Text =  "StackTrace:" + ex.StackTrace;
         }
      }
   }
}
