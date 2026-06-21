package io.sentry;

import io.sentry.vendor.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class JsonObjectWriter implements ObjectWriter {

    @NotNull
    private final JsonObjectSerializer jsonObjectSerializer;

    @NotNull
    private final JsonWriter jsonWriter;

    public JsonObjectWriter(@NotNull Writer writer, int i) {
        this.jsonWriter = new JsonWriter(writer);
        this.jsonObjectSerializer = new JsonObjectSerializer(i);
    }

    @Override // io.sentry.ObjectWriter
    @Nullable
    public String getIndent() {
        return this.jsonWriter.getIndent();
    }

    @Override // io.sentry.ObjectWriter
    public ObjectWriter jsonValue(@Nullable String str) throws IOException {
        this.jsonWriter.jsonValue(str);
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public void setIndent(@Nullable String str) {
        this.jsonWriter.setIndent(str);
    }

    @Override // io.sentry.ObjectWriter
    public void setLenient(boolean z5) {
        this.jsonWriter.setLenient(z5);
    }

    @Override // io.sentry.ObjectWriter
    public JsonObjectWriter beginArray() throws IOException {
        this.jsonWriter.beginArray();
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public JsonObjectWriter beginObject() throws IOException {
        this.jsonWriter.beginObject();
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public JsonObjectWriter endArray() {
        this.jsonWriter.endArray();
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public JsonObjectWriter endObject() {
        this.jsonWriter.endObject();
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public JsonObjectWriter name(@NotNull String str) {
        this.jsonWriter.name(str);
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public JsonObjectWriter nullValue() throws IOException {
        this.jsonWriter.nullValue();
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public JsonObjectWriter value(@Nullable String str) throws IOException {
        this.jsonWriter.value(str);
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public JsonObjectWriter value(boolean z5) throws IOException {
        this.jsonWriter.value(z5);
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public JsonObjectWriter value(@Nullable Boolean bool) throws IOException {
        this.jsonWriter.value(bool);
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public JsonObjectWriter value(double d10) throws IOException {
        this.jsonWriter.value(d10);
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public JsonObjectWriter value(long j10) throws IOException {
        this.jsonWriter.value(j10);
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public JsonObjectWriter value(@Nullable Number number) throws IOException {
        this.jsonWriter.value(number);
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public JsonObjectWriter value(@NotNull ILogger iLogger, @Nullable Object obj) {
        this.jsonObjectSerializer.serialize(this, iLogger, obj);
        return this;
    }
}
