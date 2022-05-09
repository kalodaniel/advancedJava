package org.example;

public class AggregatedResultToCsv implements Step{

    private String aggregatedResult;
    private final CsvWriterAdapter csvWriterAdapter;
    private final String csvFilePath = "src/points.csv";

    public AggregatedResultToCsv(CsvWriterAdapter csvWriterAdapter) {
        this.csvWriterAdapter = csvWriterAdapter;
    }

    @Override
    public void setInput(String input) {
        aggregatedResult = input;
    }

    @Override
    public String getOutput() {
        return csvFilePath;
    }

    @Override
    public void doIt() {
        csvWriterAdapter.writeToCsv(aggregatedResult, csvFilePath);
    }
}
