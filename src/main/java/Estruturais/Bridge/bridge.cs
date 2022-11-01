using System;
using System.Collections.Generic;
namespace Bridge.RealWorld
{
    public class Program
    {
        public static void Main(string[] args)
        {
            // Cria a abstração
            var customers = new Customers();
            
            // Relaciona com a implementação
            customers.Data = new CustomersData("Chicago");
            
            // Exercise the bridge
            customers.Show();
            customers.Next();
            customers.Show();
            customers.Next();
            customers.Show();
            customers.Add("Henry Velasquez");
            
            var customersAnotherCity = new Customers();
            customersAnotherCity.Data = new CustomersData("Another city");
            
            customers.ShowAll();
            customersAnotherCity.ShowAll();
            
            // Wait for user
            Console.ReadKey();
        }
    }
    /// <summary>
    /// Classe que é a Abstração
    /// </summary>
    public class CustomersBase
    {
        private DataObject dataObject; //objeto relacionado
        public DataObject Data 
        { 
            set { dataObject = value; }
            get { return dataObject; }
        }

        public virtual void Next()
        {
            dataObject.NextRecord();
        }

        public virtual void Add(string customer)
        {
            dataObject.AddRecord(customer);
        }
       
        public virtual void Show()
        {
            dataObject.ShowRecord();
        }
        
        public virtual void ShowAll()
        {
            dataObject.ShowAllRecords();
        }
    }
    
    /// <summary>
    /// Classe Refinada da Abstração
    /// </summary>
    public class Customers : CustomersBase
    {
        public override void ShowAll()
        {
            Console.WriteLine();
            Console.WriteLine("------------------------");
            base.ShowAll();
            Console.WriteLine("------------------------");
        }
    }
    /// <summary>
    /// Classe que representa a implementação (interface)
    /// </summary>
    public abstract class DataObject
    {
        public abstract void NextRecord();
        public abstract void PriorRecord();
        public abstract void AddRecord(string name);
        public abstract string GetCurrentRecord();
        public abstract void ShowRecord();
        public abstract void ShowAllRecords();
    }
    
    /// <summary>
    /// A implementação da interface (o objeto que está sendo relacionado)
    /// </summary>
    public class CustomersData : DataObject
    {
        private readonly List<string> customers = new List<string>();
        private int current = 0;
        private string city;
        public CustomersData(string city)
        {
            this.city = city;

            customers.Add("Jim Jones");
            customers.Add("Samual Jackson");
            customers.Add("Allen Good");
            customers.Add("Ann Stills");
            customers.Add("Lisa Giolani");
        }

        public override void NextRecord()
        {
            if (current <= customers.Count - 1)
            {
                current++;
            }
        }

        public override void PriorRecord()
        {
            if (current > 0)
            {
                current--;
            }
        }
        public override void AddRecord(string customer)
        {
            customers.Add(customer);
        }
       
        public override string GetCurrentRecord()
        {
            return customers[current];
        }

        public override void ShowRecord()
        {
            Console.WriteLine(customers[current]);
        }
        public override void ShowAllRecords()
        {
            Console.WriteLine("Customer City: " + city);
            foreach (string customer in customers)
            {
                Console.WriteLine(" " + customer);
            }
        }
    }
}