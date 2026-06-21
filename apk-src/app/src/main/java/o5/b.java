package o5;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import com.vk.api.sdk.exceptions.VKApiCodes;
import java.util.ArrayList;
import l7.o;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f29707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f29708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StringBuilder f29709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f29710d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f29711e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f29712f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f29713g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f29714h;

    public b(int i, int i10) {
        ArrayList arrayList = new ArrayList();
        this.f29707a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f29708b = arrayList2;
        StringBuilder sb2 = new StringBuilder();
        this.f29709c = sb2;
        this.f29713g = i;
        arrayList.clear();
        arrayList2.clear();
        sb2.setLength(0);
        this.f29710d = 15;
        this.f29711e = 0;
        this.f29712f = 0;
        this.f29714h = i10;
    }

    public final void a(char c8) {
        StringBuilder sb2 = this.f29709c;
        if (sb2.length() < 32) {
            sb2.append(c8);
        }
    }

    public final void b() {
        StringBuilder sb2 = this.f29709c;
        int length = sb2.length();
        if (length > 0) {
            sb2.delete(length - 1, length);
            ArrayList arrayList = this.f29707a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                a aVar = (a) arrayList.get(size);
                int i = aVar.f29706c;
                if (i != length) {
                    return;
                }
                aVar.f29706c = i - 1;
            }
        }
    }

    public final l3.b c(int i) {
        float f10;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f29708b;
            if (i10 >= arrayList.size()) {
                break;
            }
            spannableStringBuilder.append((CharSequence) arrayList.get(i10));
            spannableStringBuilder.append('\n');
            i10++;
        }
        spannableStringBuilder.append((CharSequence) d());
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int i11 = this.f29711e + this.f29712f;
        int length = (32 - i11) - spannableStringBuilder.length();
        int i12 = i11 - length;
        int i13 = i != Integer.MIN_VALUE ? i : (this.f29713g != 2 || (Math.abs(i12) >= 3 && length >= 0)) ? (this.f29713g != 2 || i12 <= 0) ? 0 : 2 : 1;
        if (i13 != 1) {
            if (i13 == 2) {
                i11 = 32 - length;
            }
            f10 = ((i11 / 32.0f) * 0.8f) + 0.1f;
        } else {
            f10 = 0.5f;
        }
        float f11 = f10;
        int i14 = this.f29710d;
        if (i14 > 7) {
            i14 -= 17;
        } else if (this.f29713g == 1) {
            i14 -= this.f29714h - 1;
        }
        return new l3.b(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, null, i14, 1, VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR, f11, i13, VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR, 0.0f, 0);
    }

    public final SpannableString d() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f29709c);
        int length = spannableStringBuilder.length();
        int i = -1;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = 0;
        int i14 = 0;
        boolean z5 = false;
        while (true) {
            ArrayList arrayList = this.f29707a;
            if (i13 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i13);
            boolean z10 = aVar.f29705b;
            int i15 = aVar.f29704a;
            if (i15 != 8) {
                boolean z11 = i15 == 7;
                if (i15 != 7) {
                    i12 = c.B[i15];
                }
                z5 = z11;
            }
            int i16 = aVar.f29706c;
            i13++;
            if (i16 != (i13 < arrayList.size() ? ((a) arrayList.get(i13)).f29706c : length)) {
                if (i != -1 && !z10) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i, i16, 33);
                    i = -1;
                } else if (i == -1 && z10) {
                    i = i16;
                }
                if (i10 != -1 && !z5) {
                    o.o(2, spannableStringBuilder, i10, i16, 33);
                    i10 = -1;
                } else if (i10 == -1 && z5) {
                    i10 = i16;
                }
                if (i12 != i11) {
                    if (i11 != -1) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(i11), i14, i16, 33);
                    }
                    i11 = i12;
                    i14 = i16;
                }
            }
        }
        if (i != -1 && i != length) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
        }
        if (i10 != -1 && i10 != length) {
            o.o(2, spannableStringBuilder, i10, length, 33);
        }
        if (i14 != length && i11 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i11), i14, length, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final boolean e() {
        return this.f29707a.isEmpty() && this.f29708b.isEmpty() && this.f29709c.length() == 0;
    }
}
