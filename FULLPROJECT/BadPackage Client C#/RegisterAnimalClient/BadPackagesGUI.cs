using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using RegisterAnimalClient.localhost;

namespace RegisterAnimalClient
{
    public partial class BadPackagesGUI : Form
    {
        public BadPackagesGUI()
        {
            InitializeComponent();
        }

        private void showallbutton_Click(object sender, EventArgs e)
        {
            resultlist.Items.Clear();
            IWebServiceBadPackage webService = new IWebServiceBadPackage();
            string response =  webService.getBadPackages(idtextbox.Text);
            string[] allPackages = response.Split(':');
            foreach (string el in allPackages)
            {
                resultlist.Items.Add(el);
            }
        }
    }
}
