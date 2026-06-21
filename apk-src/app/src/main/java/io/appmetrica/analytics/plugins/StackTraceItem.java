package io.appmetrica.analytics.plugins;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class StackTraceItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f25370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f25371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Integer f25372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f25373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f25374e;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f25375a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f25376b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f25377c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f25378d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f25379e;

        @NonNull
        public StackTraceItem build() {
            return new StackTraceItem(this.f25375a, this.f25376b, this.f25377c, this.f25378d, this.f25379e, 0);
        }

        @NonNull
        public Builder withClassName(String str) {
            this.f25375a = str;
            return this;
        }

        @NonNull
        public Builder withColumn(Integer num) {
            this.f25378d = num;
            return this;
        }

        @NonNull
        public Builder withFileName(String str) {
            this.f25376b = str;
            return this;
        }

        @NonNull
        public Builder withLine(Integer num) {
            this.f25377c = num;
            return this;
        }

        @NonNull
        public Builder withMethodName(String str) {
            this.f25379e = str;
            return this;
        }
    }

    public /* synthetic */ StackTraceItem(String str, String str2, Integer num, Integer num2, String str3, int i) {
        this(str, str2, num, num2, str3);
    }

    public String getClassName() {
        return this.f25370a;
    }

    public Integer getColumn() {
        return this.f25373d;
    }

    public String getFileName() {
        return this.f25371b;
    }

    public Integer getLine() {
        return this.f25372c;
    }

    public String getMethodName() {
        return this.f25374e;
    }

    private StackTraceItem(String str, String str2, Integer num, Integer num2, String str3) {
        this.f25370a = str;
        this.f25371b = str2;
        this.f25372c = num;
        this.f25373d = num2;
        this.f25374e = str3;
    }
}
