/********************************************************************************
** Form generated from reading UI file 'qwdialog.ui'
**
** Created by: Qt User Interface Compiler version 5.9.0
**
** WARNING! All changes made in this file will be lost when recompiling UI file!
********************************************************************************/

#ifndef UI_QWDIALOG_H
#define UI_QWDIALOG_H

#include <QtCore/QVariant>
#include <QtWidgets/QAction>
#include <QtWidgets/QApplication>
#include <QtWidgets/QButtonGroup>
#include <QtWidgets/QCheckBox>
#include <QtWidgets/QDialog>
#include <QtWidgets/QGridLayout>
#include <QtWidgets/QGroupBox>
#include <QtWidgets/QHBoxLayout>
#include <QtWidgets/QHeaderView>
#include <QtWidgets/QPushButton>
#include <QtWidgets/QRadioButton>
#include <QtWidgets/QSpacerItem>
#include <QtWidgets/QTextEdit>

QT_BEGIN_NAMESPACE

class Ui_QWDialog
{
public:
    QGridLayout *gridLayout;
    QGroupBox *groupBox_2;
    QHBoxLayout *horizontalLayout_2;
    QRadioButton *rBtnBlack;
    QRadioButton *rBtnRed;
    QRadioButton *rBtnBlue;
    QHBoxLayout *horizontalLayout_3;
    QPushButton *btnOK;
    QSpacerItem *horizontalSpacer_3;
    QPushButton *btnCancel;
    QSpacerItem *horizontalSpacer_2;
    QPushButton *btnClose;
    QGroupBox *groupBox;
    QHBoxLayout *horizontalLayout;
    QCheckBox *checkBoxUnder;
    QCheckBox *checkBoxItalic;
    QCheckBox *checkBoxBold;
    QTextEdit *txtEdit;
    QSpacerItem *verticalSpacer;

    void setupUi(QDialog *QWDialog)
    {
        if (QWDialog->objectName().isEmpty())
            QWDialog->setObjectName(QStringLiteral("QWDialog"));
        QWDialog->resize(519, 376);
        gridLayout = new QGridLayout(QWDialog);
        gridLayout->setSpacing(6);
        gridLayout->setContentsMargins(11, 11, 11, 11);
        gridLayout->setObjectName(QStringLiteral("gridLayout"));
        groupBox_2 = new QGroupBox(QWDialog);
        groupBox_2->setObjectName(QStringLiteral("groupBox_2"));
        horizontalLayout_2 = new QHBoxLayout(groupBox_2);
        horizontalLayout_2->setSpacing(6);
        horizontalLayout_2->setContentsMargins(11, 11, 11, 11);
        horizontalLayout_2->setObjectName(QStringLiteral("horizontalLayout_2"));
        rBtnBlack = new QRadioButton(groupBox_2);
        rBtnBlack->setObjectName(QStringLiteral("rBtnBlack"));

        horizontalLayout_2->addWidget(rBtnBlack);

        rBtnRed = new QRadioButton(groupBox_2);
        rBtnRed->setObjectName(QStringLiteral("rBtnRed"));

        horizontalLayout_2->addWidget(rBtnRed);

        rBtnBlue = new QRadioButton(groupBox_2);
        rBtnBlue->setObjectName(QStringLiteral("rBtnBlue"));

        horizontalLayout_2->addWidget(rBtnBlue);


        gridLayout->addWidget(groupBox_2, 1, 0, 1, 1);

        horizontalLayout_3 = new QHBoxLayout();
        horizontalLayout_3->setSpacing(6);
        horizontalLayout_3->setObjectName(QStringLiteral("horizontalLayout_3"));
        btnOK = new QPushButton(QWDialog);
        btnOK->setObjectName(QStringLiteral("btnOK"));

        horizontalLayout_3->addWidget(btnOK);

        horizontalSpacer_3 = new QSpacerItem(40, 20, QSizePolicy::Expanding, QSizePolicy::Minimum);

        horizontalLayout_3->addItem(horizontalSpacer_3);

        btnCancel = new QPushButton(QWDialog);
        btnCancel->setObjectName(QStringLiteral("btnCancel"));

        horizontalLayout_3->addWidget(btnCancel);

        horizontalSpacer_2 = new QSpacerItem(40, 20, QSizePolicy::Expanding, QSizePolicy::Minimum);

        horizontalLayout_3->addItem(horizontalSpacer_2);

        btnClose = new QPushButton(QWDialog);
        btnClose->setObjectName(QStringLiteral("btnClose"));

        horizontalLayout_3->addWidget(btnClose);


        gridLayout->addLayout(horizontalLayout_3, 4, 0, 1, 1);

        groupBox = new QGroupBox(QWDialog);
        groupBox->setObjectName(QStringLiteral("groupBox"));
        horizontalLayout = new QHBoxLayout(groupBox);
        horizontalLayout->setSpacing(6);
        horizontalLayout->setContentsMargins(11, 11, 11, 11);
        horizontalLayout->setObjectName(QStringLiteral("horizontalLayout"));
        checkBoxUnder = new QCheckBox(groupBox);
        checkBoxUnder->setObjectName(QStringLiteral("checkBoxUnder"));

        horizontalLayout->addWidget(checkBoxUnder);

        checkBoxItalic = new QCheckBox(groupBox);
        checkBoxItalic->setObjectName(QStringLiteral("checkBoxItalic"));

        horizontalLayout->addWidget(checkBoxItalic);

        checkBoxBold = new QCheckBox(groupBox);
        checkBoxBold->setObjectName(QStringLiteral("checkBoxBold"));

        horizontalLayout->addWidget(checkBoxBold);


        gridLayout->addWidget(groupBox, 0, 0, 1, 1);

        txtEdit = new QTextEdit(QWDialog);
        txtEdit->setObjectName(QStringLiteral("txtEdit"));
        QFont font;
        font.setPointSize(20);
        font.setBold(false);
        font.setWeight(50);
        txtEdit->setFont(font);

        gridLayout->addWidget(txtEdit, 2, 0, 1, 1);

        verticalSpacer = new QSpacerItem(20, 0, QSizePolicy::Minimum, QSizePolicy::Expanding);

        gridLayout->addItem(verticalSpacer, 3, 0, 1, 1);


        retranslateUi(QWDialog);
        QObject::connect(btnOK, SIGNAL(clicked()), QWDialog, SLOT(accept()));
        QObject::connect(btnCancel, SIGNAL(clicked()), QWDialog, SLOT(reject()));
        QObject::connect(btnClose, SIGNAL(clicked()), QWDialog, SLOT(close()));

        QMetaObject::connectSlotsByName(QWDialog);
    } // setupUi

    void retranslateUi(QDialog *QWDialog)
    {
        QWDialog->setWindowTitle(QApplication::translate("QWDialog", "Form created manually", Q_NULLPTR));
        groupBox_2->setTitle(QString());
        rBtnBlack->setText(QApplication::translate("QWDialog", "Black", Q_NULLPTR));
        rBtnRed->setText(QApplication::translate("QWDialog", "Red", Q_NULLPTR));
        rBtnBlue->setText(QApplication::translate("QWDialog", "Blue", Q_NULLPTR));
        btnOK->setText(QApplication::translate("QWDialog", "\347\241\256\345\256\232", Q_NULLPTR));
        btnCancel->setText(QApplication::translate("QWDialog", "\345\217\226\346\266\210", Q_NULLPTR));
        btnClose->setText(QApplication::translate("QWDialog", "\351\200\200\345\207\272", Q_NULLPTR));
        groupBox->setTitle(QString());
        checkBoxUnder->setText(QApplication::translate("QWDialog", "Underline", Q_NULLPTR));
        checkBoxItalic->setText(QApplication::translate("QWDialog", "Italic", Q_NULLPTR));
        checkBoxBold->setText(QApplication::translate("QWDialog", "Bold", Q_NULLPTR));
        txtEdit->setHtml(QApplication::translate("QWDialog", "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0//EN\" \"http://www.w3.org/TR/REC-html40/strict.dtd\">\n"
"<html><head><meta name=\"qrichtext\" content=\"1\" /><style type=\"text/css\">\n"
"p, li { white-space: pre-wrap; }\n"
"</style></head><body style=\" font-family:'SimSun'; font-size:20pt; font-weight:400; font-style:normal;\">\n"
"<p style=\"-qt-paragraph-type:empty; margin-top:0px; margin-bottom:0px; margin-left:0px; margin-right:0px; -qt-block-indent:0; text-indent:0px;\"><br /></p></body></html>", Q_NULLPTR));
    } // retranslateUi

};

namespace Ui {
    class QWDialog: public Ui_QWDialog {};
} // namespace Ui

QT_END_NAMESPACE

#endif // UI_QWDIALOG_H
