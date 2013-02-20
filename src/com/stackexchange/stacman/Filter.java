package com.stackexchange.stacman;

public final class Filter {
    private String filter;
    public String getFilterName() { return filter; }

    private String filter_type;
    public FilterType getFilterType() { return FilterType.valueOf(filter_type); }

    private String[] included_fields;
    public String[] getIncludedFields() { return included_fields; }
}
