package ql;

import java.io.Serializable;
import java.io.Writer;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends Writer implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StringBuilder f32136b = new StringBuilder(4);

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(char c8) {
        this.f32136b.append(c8);
        return this;
    }

    public final String toString() {
        return this.f32136b.toString();
    }

    @Override // java.io.Writer
    public final void write(String str) {
        if (str != null) {
            this.f32136b.append(str);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(char c8) {
        this.f32136b.append(c8);
        return this;
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i10) {
        if (cArr != null) {
            this.f32136b.append(cArr, i, i10);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) {
        this.f32136b.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        this.f32136b.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i, int i10) {
        this.f32136b.append(charSequence, i, i10);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i10) {
        this.f32136b.append(charSequence, i, i10);
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
    }
}
