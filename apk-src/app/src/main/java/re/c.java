package re;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class c implements Closeable, Flushable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String[] f32311j = new String[128];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String[] f32312k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Writer f32313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f32314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f32315d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f32316e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f32317f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f32318g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f32319h;
    public boolean i;

    static {
        for (int i = 0; i <= 31; i++) {
            f32311j[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f32311j;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f32312k = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        int[] iArr = new int[32];
        this.f32314c = iArr;
        this.f32315d = 0;
        if (iArr.length == 0) {
            this.f32314c = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f32314c;
        int i = this.f32315d;
        this.f32315d = i + 1;
        iArr2[i] = 6;
        this.f32316e = StringUtils.PROCESS_POSTFIX_DELIMITER;
        this.i = true;
        if (writer == null) {
            throw new NullPointerException("out == null");
        }
        this.f32313b = writer;
    }

    public void I(boolean z5) throws IOException {
        J();
        a();
        this.f32313b.write(z5 ? "true" : "false");
    }

    public final void J() throws IOException {
        if (this.f32319h != null) {
            int iJ = j();
            if (iJ == 5) {
                this.f32313b.write(44);
            } else if (iJ != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            h();
            this.f32314c[this.f32315d - 1] = 4;
            k(this.f32319h);
            this.f32319h = null;
        }
    }

    public final void a() throws IOException {
        int iJ = j();
        if (iJ == 1) {
            this.f32314c[this.f32315d - 1] = 2;
            h();
            return;
        }
        Writer writer = this.f32313b;
        if (iJ == 2) {
            writer.append(',');
            h();
        } else {
            if (iJ == 4) {
                writer.append((CharSequence) this.f32316e);
                this.f32314c[this.f32315d - 1] = 5;
                return;
            }
            if (iJ != 6) {
                if (iJ != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f32317f) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.f32314c[this.f32315d - 1] = 7;
        }
    }

    public final void b(int i, int i10, char c8) throws IOException {
        int iJ = j();
        if (iJ != i10 && iJ != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f32319h != null) {
            throw new IllegalStateException("Dangling name: " + this.f32319h);
        }
        this.f32315d--;
        if (iJ == i10) {
            h();
        }
        this.f32313b.write(c8);
    }

    public void beginArray() throws IOException {
        J();
        a();
        int i = this.f32315d;
        int[] iArr = this.f32314c;
        if (i == iArr.length) {
            this.f32314c = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.f32314c;
        int i10 = this.f32315d;
        this.f32315d = i10 + 1;
        iArr2[i10] = 1;
        this.f32313b.write(91);
    }

    public void beginObject() throws IOException {
        J();
        a();
        int i = this.f32315d;
        int[] iArr = this.f32314c;
        if (i == iArr.length) {
            this.f32314c = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.f32314c;
        int i10 = this.f32315d;
        this.f32315d = i10 + 1;
        iArr2[i10] = 3;
        this.f32313b.write(123);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f32313b.close();
        int i = this.f32315d;
        if (i > 1 || (i == 1 && this.f32314c[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f32315d = 0;
    }

    public void d(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f32319h != null) {
            throw new IllegalStateException();
        }
        if (this.f32315d == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f32319h = str;
    }

    public void endArray() throws IOException {
        b(1, 2, ']');
    }

    public void endObject() throws IOException {
        b(3, 5, '}');
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f32315d == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f32313b.flush();
    }

    public c i() throws IOException {
        if (this.f32319h != null) {
            if (!this.i) {
                this.f32319h = null;
                return this;
            }
            J();
        }
        a();
        this.f32313b.write("null");
        return this;
    }

    public final int j() {
        int i = this.f32315d;
        if (i != 0) {
            return this.f32314c[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.f32318g
            if (r0 == 0) goto L7
            java.lang.String[] r0 = re.c.f32312k
            goto L9
        L7:
            java.lang.String[] r0 = re.c.f32311j
        L9:
            java.io.Writer r1 = r8.f32313b
            r2 = 34
            r1.write(r2)
            int r3 = r9.length()
            r4 = 0
            r5 = r4
        L16:
            if (r4 >= r3) goto L41
            char r6 = r9.charAt(r4)
            r7 = 128(0x80, float:1.8E-43)
            if (r6 >= r7) goto L25
            r6 = r0[r6]
            if (r6 != 0) goto L32
            goto L3e
        L25:
            r7 = 8232(0x2028, float:1.1535E-41)
            if (r6 != r7) goto L2c
            java.lang.String r6 = "\\u2028"
            goto L32
        L2c:
            r7 = 8233(0x2029, float:1.1537E-41)
            if (r6 != r7) goto L3e
            java.lang.String r6 = "\\u2029"
        L32:
            if (r5 >= r4) goto L39
            int r7 = r4 - r5
            r1.write(r9, r5, r7)
        L39:
            r1.write(r6)
            int r5 = r4 + 1
        L3e:
            int r4 = r4 + 1
            goto L16
        L41:
            if (r5 >= r3) goto L47
            int r3 = r3 - r5
            r1.write(r9, r5, r3)
        L47:
            r1.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: re.c.k(java.lang.String):void");
    }

    public void l(long j10) throws IOException {
        J();
        a();
        this.f32313b.write(Long.toString(j10));
    }

    public void m(Number number) throws IOException {
        if (number == null) {
            i();
            return;
        }
        J();
        String string = number.toString();
        if (this.f32317f || !(string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            a();
            this.f32313b.append((CharSequence) string);
        } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        }
    }

    public void s(String str) throws IOException {
        if (str == null) {
            i();
            return;
        }
        J();
        a();
        k(str);
    }

    public final void h() {
    }
}
