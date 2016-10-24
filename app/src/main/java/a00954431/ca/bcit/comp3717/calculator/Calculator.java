package a00954431.ca.bcit.comp3717.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {

    private String TAG = Calculator.class.getSimpleName();
    private TextView banner;
    private int part1;
    private int part2;
    private Double result;
    private int symbol;
    private boolean first;
    protected Button zero;
    protected Button one;
    protected Button two;
    protected Button three;
    protected Button four;
    protected Button five;
    protected Button six;
    protected Button seven;
    protected Button eight;
    protected Button nine;
    protected Button add;
    protected Button subtract;
    protected Button divide;
    protected Button multiply;
    protected Button equals;
    protected Button clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        instantiate();
        setListeners();
    }

    private void instantiate() {
        // instantiate number input flag (true = first number, false = second number)
        first = true;
        symbol = 0; // add = 1, subtract = 2, divide = 3, multiple = 4

        // instantiate all buttons
        zero = (Button) findViewById(R.id.btn_no0);
        one = (Button) findViewById(R.id.btn_no1);
        two = (Button) findViewById(R.id.btn_no2);
        three = (Button) findViewById(R.id.btn_no3);
        four = (Button) findViewById(R.id.btn_no4);
        five = (Button) findViewById(R.id.btn_no5);
        six = (Button) findViewById(R.id.btn_no6);
        seven = (Button) findViewById(R.id.btn_no7);
        eight = (Button) findViewById(R.id.btn_no8);
        nine = (Button) findViewById(R.id.btn_no9);
        add = (Button) findViewById(R.id.btn_add);
        subtract = (Button) findViewById(R.id.btn_subtract);
        divide = (Button) findViewById(R.id.btn_divide);
        multiply = (Button) findViewById(R.id.btn_multi);
        equals = (Button)findViewById(R.id.btn_equals);
        clear = (Button)findViewById(R.id.btn_clear);

        // instantiate banner text
        banner = (TextView) findViewById(R.id.textView);
    }

    private void setListeners() {
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                banner.append("0");
                if (first == true) {
                    part1 = Integer.valueOf(String.valueOf(part1) + String.valueOf(0));
                } else {
                    part2 = Integer.valueOf(String.valueOf(part2) + String.valueOf(0));
                }
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                banner.append("1");
                if (first) {
                    part1 = Integer.valueOf(String.valueOf(part1) + String.valueOf(1));
                } else {
                    part2 = Integer.valueOf(String.valueOf(part2) + String.valueOf(1));
                }
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                banner.append("2");
                if (first) {
                    part1 = Integer.valueOf(String.valueOf(part1) + String.valueOf(2));
                } else {
                    part2 = Integer.valueOf(String.valueOf(part2) + String.valueOf(2));
                }
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                banner.append("3");
                if (first) {
                    part1 = Integer.valueOf(String.valueOf(part1) + String.valueOf(3));
                } else {
                    part2 = Integer.valueOf(String.valueOf(part2) + String.valueOf(3));
                }
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                banner.append("4");
                if (first) {
                    part1 = Integer.valueOf(String.valueOf(part1) + String.valueOf(4));
                } else {
                    part2 = Integer.valueOf(String.valueOf(part2) + String.valueOf(4));
                }
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                banner.append("5");
                if (first) {
                    part1 = Integer.valueOf(String.valueOf(part1) + String.valueOf(5));
                } else {
                    part2 = Integer.valueOf(String.valueOf(part2) + String.valueOf(5));
                }
            }
        });

        six.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v) {
                banner.append("6");
                if (first) {
                    part1 = Integer.valueOf(String.valueOf(part1) + String.valueOf(6));
                } else {
                    part2 = Integer.valueOf(String.valueOf(part2) + String.valueOf(6));
                }
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                banner.append("7");
                if (first) {
                    part1 = Integer.valueOf(String.valueOf(part1) + String.valueOf(7));
                } else {
                    part2 = Integer.valueOf(String.valueOf(part2) + String.valueOf(7));
                }
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                banner.append("8");
                if (first) {
                    part1 = Integer.valueOf(String.valueOf(part1) + String.valueOf(8));
                } else {
                    part2 = Integer.valueOf(String.valueOf(part2) + String.valueOf(8));
                }
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                banner.append("9");
                if (first) {
                    part1 = Integer.valueOf(String.valueOf(part1) + String.valueOf(9));
                } else {
                    part2 = Integer.valueOf(String.valueOf(part2) + String.valueOf(9));
                }
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                if (first) {
                    banner.append(" + ");
                    symbol = 1;
                    first = false;
                } else {
                    Log.e(TAG, "Add without first number");
                }
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                if (first) {
                    banner.append(" - ");
                    symbol = 2;
                    first = false;
                } else {
                    Log.e(TAG, "Subtract without first number");
                }
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                if (first) {
                    banner.append(" / ");
                    symbol = 3;
                    first = false;
                } else {
                    Log.e(TAG, "Divide without first number");
                }
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                if (first) {
                    banner.append(" * ");
                    symbol = 4;
                    first = false;
                } else {
                    Log.e(TAG, "Multiply without first number");
                }
            }
        });

        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(symbol) {
                    case 1:
                        result = (double) part1 + part2;
                        break;
                    case 2:
                        result = (double) part1 - part2;
                        break;
                    case 3:
                        if (part2 != 0) {
                            result = (double) part1 / part2;
                        } else {
                            banner.setText("infinite");
                            Log.e(TAG, "divide by 0");
                            return;
                        }
                        break;
                    case 4:
                        result = (double) part1 * part2;
                        break;
                    default:
                        Log.e(TAG, "No symbole - how did you get here");
                }
                banner.setText(result.toString());
                reset();
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset();
                banner.setText("");
            }
        });
    }

    private void reset() {
        first = true;
        result = 0.0;
        part1 = 0;
        part2 = 0;
    }
}