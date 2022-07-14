import pandas as pd

file_name = 'C:\\Users\\vvenkatr092820\\Downloads\\categorization.xlsx'

df = pd.read_excel(file_name)


for i, row in df.iterrows():

    mcc = row['merchant_category_id']

    if 1 <= mcc <= 1499:

        df.loc[i,['Categorization']] = 'Agricultural Services'

    elif 1500 <= mcc <= 2999:

        df.loc[i,['Categorization']] = 'Contracted Services'

    elif 3000 <= mcc <= 3299:

        df.loc[i,['Categorization']] = 'Airlines'

    elif 3300 <= mcc <= 3499:

        df.loc[i,['Categorization']] = 'Car Rental'

    elif 3500 <= mcc <= 3999:

        df.loc[i,['Categorization']] = 'Lodging'

    elif 4000 <= mcc <= 4799:

        df.loc[i,['Categorization']] = 'Transportation Services'

    elif 4800 <= mcc <= 4999:

        df.loc[i,['Categorization']] = 'Utility Services'

    elif 5000 <= mcc <= 5599:

        df.loc[i,['Categorization']] = 'Retail Outlet Services'

    elif 5600 <= mcc <= 5699:

        df.loc[i,['Categorization']] = 'Clothing Stores'

    elif 5700 <= mcc <= 7299:

        df.loc[i,['Categorization']] = 'Miscellaneous Stores'

    elif 7300 <= mcc <= 7999:

        df.loc[i,['Categorization']] = 'Business Services'

    elif 8000 <= mcc <= 8999:

        df.loc[i,['Categorization']] = 'Professional Services and Membership Organizations'

    elif 9000 <= mcc <= 9999:

        df.loc[i,['Categorization']] = 'Government Services'

   

   

df.to_excel('C:\\Users\\vvenkatr092820\\Downloads\\categorization.xlsx', index='False')