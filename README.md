
# Automated Classification of Overfitting Patches with Statically Extracted Code Features

This is the repository of [Automated Classification of Overfitting Patches with Statically Extracted Code Features](http://arxiv.org/pdf/1910.12057) ([doi:10.1109/tse.2021.3071750](https://doi.org/10.1109/tse.2021.3071750))

```
@article{ye2021ods,
 title = {Automated Classification of Overfitting Patches with Statically Extracted Code Features},
 author = {He Ye and Jian Gu and Matias Martinez and Thomas Durieux and Martin Monperrus},
 journal = {IEEE Transactions on Software Engineering},
 year = {2021},
 doi = {10.1109/tse.2021.3071750},
}
```



## Folder Structure
 ```bash
├── Experiment: csv feature data and script for reproducing our experiment
│ 
├── Features: ODS code features
│   └── Code: ODS code description features in JSON format
│   └── Patterns: ODS repair pattern features in JSON format
│   └── Context: ODS context features in JSON format 
├── Source: The source program files that can be taken input for Coming to generate ODS features
│
├── Tests: Evosuite tests generated for Bugs.jar and Bears for labeling the correctness of RepairThemAll patches
│
└── RawRepairThemAllPatches: raw patches from the experiment of RepairThemAll

```


## ODS Feature Extraction

We have integrated ODS feature extraction with an open source tool [Coming](https://github.com/SpoonLabs/coming). 
To extract code features, you can parse a pair of source and target files in Source folder. 
Use the feature mode of Coming to obtain ODS features. 

## parameters
We use the default parameters of XGBoost (i.e., learning_rate sets to 0.3 and max_depth sets to 6), only turning the gamma to 0.5. All parameters can be found in our notebooks. 





