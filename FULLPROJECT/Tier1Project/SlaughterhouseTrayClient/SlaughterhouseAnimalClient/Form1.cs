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

   public partial class TrayClient : Form
   {
      private Slaughterhouse.ISlaughterhouseWebService webService = new Slaughterhouse.ISlaughterhouseWebService();
      private string selectedAnimal;

      public TrayClient()
      {
         InitializeComponent();
         checkedListBox1.SelectionMode = SelectionMode.One;
         //checkedListBox1.
         //checkedListBox1.
      }

      private void button1_Click( object sender, EventArgs e )
      {
         try
         {
            string msg =  webService.readIncomingMessage( "REQUEST_UNCUT_ANIMALS" );
            string[] split = msg.Split(':');
            string[] animalIds = split[1].Split(',');
            foreach (var id in animalIds )
            {
               checkedListBox1.Items.Add(id);
            }
            selectedAnimal = animalIds[0];
            textBox2.Text = msg;
         }
         catch (Exception ex)
         {
            textBox2.Text =  "StackTrace:" + ex.StackTrace;
         }
      }

      private void button2_Click( object sender, EventArgs e )
      {
         if ( checkedListBox1.CheckedItems.Count == 1)
         {
            selectedAnimal = checkedListBox1.CheckedItems[0].ToString();
            textBox2.Text = webService.readIncomingMessage( string.Format( "SPLIT_ANIMAL {0} weights:{1},{2}", selectedAnimal, weight1.Text, weight2.Text ) );
            checkedListBox1.Items.RemoveAt(0);
         }
      }


      private void checkedListBox1_ItemCheck( object sender, ItemCheckEventArgs e )
      {
         if( e.NewValue == CheckState.Checked && checkedListBox1.CheckedItems.Count > 0 )
         {
            checkedListBox1.ItemCheck -= checkedListBox1_ItemCheck;
            checkedListBox1.SetItemChecked( checkedListBox1.CheckedIndices[0], false );
            checkedListBox1.ItemCheck += checkedListBox1_ItemCheck;
         }
         

      }
   }
}
