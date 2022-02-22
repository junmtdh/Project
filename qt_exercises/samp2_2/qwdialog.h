#ifndef QWDIALOG_H
#define QWDIALOG_H

#include <QDialog>

namespace Ui {
class QWDialog;
}

class QWDialog : public QDialog
{
    Q_OBJECT

public:
    explicit QWDialog(QWidget *parent = 0);
    ~QWDialog();

private slots:
    void on_checkBoxUnder_clicked(bool checked);

    void on_checkBoxItalic_clicked(bool checked);

    void on_checkBoxBold_clicked(bool checked);

    void setTextFontColor();

private:
    Ui::QWDialog *ui;
};

#endif // QWDIALOG_H
