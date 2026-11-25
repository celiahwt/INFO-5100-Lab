Python 3.13.14 (v3.13.14:fd17997c386, Jun 10 2026, 08:55:00) [Clang 21.0.0 (clang-2100.1.1.101)] on darwin
Enter "help" below or click "Help" above for more information.
>>> import os
>>> print(os.getcwd())
/Users/celia_hwt/Documents
>>> path = '/Users/celia_hwt/Desktop/INFO 5100/IrisDataset/Iris.csv'
>>> import pandas as pd
>>> df = pd.read_csv(path)
>>> print(df.head())
   Id  SepalLengthCm  SepalWidthCm  PetalLengthCm  PetalWidthCm      Species
0   1            5.1           3.5            1.4           0.2  Iris-setosa
1   2            4.9           3.0            1.4           0.2  Iris-setosa
2   3            4.7           3.2            1.3           0.2  Iris-setosa
3   4            4.6           3.1            1.5           0.2  Iris-setosa
4   5            5.0           3.6            1.4           0.2  Iris-setosa
>>> print(df.shape)
(150, 6)
>>> import matplotlib.pyplot as plt
Matplotlib is building the font cache; this may take a moment.
>>> import seaborn as sns
>>> sns.set_theme(style="whitegrid")
>>> #Plot 1: Histogram of petal length by species (seaborn)
>>> sns.histplot(data=df, x="PetalLengthCm", hue="Species", kde=True)
<Axes: xlabel='PetalLengthCm', ylabel='Count'>
>>> plt.title("Distribution of Petal Length by Species")
Text(0.5, 1.0, 'Distribution of Petal Length by Species')
>>> plt.show()
>>> 
>>> # Plot 2: Scatter plot, sepal length vs sepal width (matplotlib)
>>> colors = {"Iris-setosa": "red", "Iris-versicolor": "green", "Iris-virginica": "blue"}
... 
>>> for species, group in df.groupby("Species"):
...     plt.scatter(group["SepalLengthCm"], group["SepalWidthCm"],
...                 label=species, color=colors[species])
... 
...     
<matplotlib.collections.PathCollection object at 0x11104eba0>
<matplotlib.collections.PathCollection object at 0x1136a3250>
<matplotlib.collections.PathCollection object at 0x1136a3610>
>>> plt.xlabel("Sepal Length (cm)")
Text(0.5, 39.42432725694444, 'Sepal Length (cm)')
>>> plt.ylabel("Sepal Width (cm)")
Text(79.5, 0.5, 'Sepal Width (cm)')
plt.title("Sepal Length vs Sepal Width")
Text(0.5, 1.0, 'Sepal Length vs Sepal Width')
plt.legend()
<matplotlib.legend.Legend object at 0x11366ec10>
plt.show()

plt.show()







# Plot 2: Scatter plot, sepal length vs sepal width (matplotlib)
colors = {"Iris-setosa": "red", "Iris-versicolor": "green", "Iris-virginica": "blue"}
for species, group in df.groupby("Species"):
    plt.scatter(group["SepalLengthCm"], group["SepalWidthCm"],
                label=species, color=colors[species])


<matplotlib.collections.PathCollection object at 0x1175d0b90>
<matplotlib.collections.PathCollection object at 0x1175d0cd0>
<matplotlib.collections.PathCollection object at 0x1175d0e10>
plt.xlabel("Sepal Length (cm)")
Text(0.5, 39.42432725694444, 'Sepal Length (cm)')
plt.ylabel("Sepal Width (cm)")
Text(79.5, 0.5, 'Sepal Width (cm)')
plt.title("Sepal Length vs Sepal Width")
Text(0.5, 1.0, 'Sepal Length vs Sepal Width')
plt.legend()
<matplotlib.legend.Legend object at 0x113725090>
plt.show()






# Plot 3: Box plot of petal width by species (seaborn)
sns.boxplot(data=df, x="Species", y="PetalWidthCm")
<Axes: xlabel='Species', ylabel='PetalWidthCm'>
plt.title("Petal Width by Species")
Text(0.5, 1.0, 'Petal Width by Species')
plt.show()



# Plot 4: Correlation heatmap (seaborn)
corr = df.drop(columns=["Id", "Species"]).corr()
sns.heatmap(corr, annot=True, cmap="coolwarm")
<Axes: >
plt.title("Feature Correlation Heatmap")
Text(0.5, 1.0, 'Feature Correlation Heatmap')
plt.show()
