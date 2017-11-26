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

   public partial class PackClient : Form
   {
      private Slaughterhouse.ISlaughterhouseWebService webService = new Slaughterhouse.ISlaughterhouseWebService();
      private string selectedAnimal;

      public PackClient()
      {
         InitializeComponent();
         checkedListBox1.SelectionMode = SelectionMode.One;
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

      private void requestLEG_Click( object sender, EventArgs e )
      {
         try
         {
            string msg =  webService.readIncomingMessage( "REQUEST_TRAYS_READY_FOR_PACKAGING LEG" );
            string[] split = msg.Split(':');
            string[] traysIds = split[1].Split(',');
            foreach( var id in traysIds )
            {
               checkedListBox1.Items.Add( id );
            }
            textBox2.Text = msg;
         }
         catch( Exception ex )
         {
            textBox2.Text = "StackTrace:" + ex.StackTrace;
         }
      }

      private void requestHAM_Click( object sender, EventArgs e )
      {
         try
         {
            string msg =  webService.readIncomingMessage( "REQUEST_TRAYS_READY_FOR_PACKAGING HAM" );
            string[] split = msg.Split(':');
            string[] traysIds = split[1].Split(',');
            foreach( var id in traysIds )
            {
               checkedListBox1.Items.Add( id );
            }
            textBox2.Text = msg;
         }
         catch( Exception ex )
         {
            textBox2.Text = "StackTrace:" + ex.StackTrace;
         }
      }

      private void registerPackage_Click( object sender, EventArgs e )
      {       
            //REGISTER_PACKAGE trays:97c5134f-13e7-4d0c-8bd3-1d5cf5e0036a,97c5134f-13e7-4d0c-8bd3-1d5cf5e0036a      
      }
   }
}
