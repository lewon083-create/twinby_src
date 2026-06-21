package com.google.android.gms.internal.ads;

import android.util.Log;
import java.io.IOException;
import java.io.Writer;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class jm1 extends Writer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StringBuilder f6887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CharSequence f6888d;

    public jm1(StringBuilder sb2) {
        this.f6886b = 0;
        this.f6888d = new im1();
        this.f6887c = sb2;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        switch (this.f6886b) {
            case 0:
                this.f6887c.append(charSequence);
                return this;
            default:
                return super.append(charSequence);
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f6886b) {
            case 0:
                break;
            default:
                d();
                break;
        }
    }

    public void d() {
        StringBuilder sb2 = this.f6887c;
        if (sb2.length() > 0) {
            Log.d((String) this.f6888d, sb2.toString());
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        switch (this.f6886b) {
            case 0:
                break;
            default:
                d();
                break;
        }
    }

    @Override // java.io.Writer
    public void write(int i) throws IOException {
        switch (this.f6886b) {
            case 0:
                this.f6887c.append((char) i);
                break;
            default:
                super.write(i);
                break;
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        switch (this.f6886b) {
            case 0:
                append(charSequence);
                return this;
            default:
                return super.append(charSequence);
        }
    }

    @Override // java.io.Writer
    public void write(String str, int i, int i10) throws IOException {
        switch (this.f6886b) {
            case 0:
                Objects.requireNonNull(str);
                this.f6887c.append((CharSequence) str, i, i10 + i);
                break;
            default:
                super.write(str, i, i10);
                break;
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i, int i10) {
        switch (this.f6886b) {
            case 0:
                this.f6887c.append(charSequence, i, i10);
                return this;
            default:
                return super.append(charSequence, i, i10);
        }
    }

    public jm1() {
        this.f6886b = 1;
        this.f6887c = new StringBuilder(128);
        this.f6888d = "FragmentManager";
    }

    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i, int i10) {
        switch (this.f6886b) {
            case 0:
                append(charSequence, i, i10);
                return this;
            default:
                return super.append(charSequence, i, i10);
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i10) {
        switch (this.f6886b) {
            case 0:
                im1 im1Var = (im1) this.f6888d;
                im1Var.f6550b = cArr;
                im1Var.f6551c = null;
                this.f6887c.append((CharSequence) im1Var, i, i10 + i);
                break;
            default:
                for (int i11 = 0; i11 < i10; i11++) {
                    char c8 = cArr[i + i11];
                    if (c8 == '\n') {
                        d();
                    } else {
                        this.f6887c.append(c8);
                    }
                }
                break;
        }
    }

    private final void a() {
    }

    private final void b() {
    }
}
