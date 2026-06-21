package yads;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import com.vk.api.sdk.exceptions.VKApiCodes;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class gt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f38862a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f38863b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StringBuilder f38864c = new StringBuilder();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f38865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f38866e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f38867f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f38868g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f38869h;

    public gt(int i, int i10) {
        b(i);
        this.f38869h = i10;
    }

    public final void a() {
        int length = this.f38864c.length();
        if (length > 0) {
            this.f38864c.delete(length - 1, length);
            for (int size = this.f38862a.size() - 1; size >= 0; size--) {
                ft ftVar = (ft) this.f38862a.get(size);
                int i = ftVar.f38548c;
                if (i != length) {
                    return;
                }
                ftVar.f38548c = i - 1;
            }
        }
    }

    public final void b(int i) {
        this.f38868g = i;
        this.f38862a.clear();
        this.f38863b.clear();
        this.f38864c.setLength(0);
        this.f38865d = 15;
        this.f38866e = 0;
        this.f38867f = 0;
    }

    public final o20 a(int i) {
        int i10;
        float f10;
        int i11 = this.f38866e + this.f38867f;
        int i12 = 32 - i11;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i13 = 0; i13 < this.f38863b.size(); i13++) {
            CharSequence charSequenceSubSequence = (CharSequence) this.f38863b.get(i13);
            int i14 = lb3.f40466a;
            if (charSequenceSubSequence.length() > i12) {
                charSequenceSubSequence = charSequenceSubSequence.subSequence(0, i12);
            }
            spannableStringBuilder.append(charSequenceSubSequence);
            spannableStringBuilder.append('\n');
        }
        SpannableString spannableStringB = b();
        int i15 = lb3.f40466a;
        int length = spannableStringB.length();
        SpannableString spannableStringSubSequence = spannableStringB;
        if (length > i12) {
            spannableStringSubSequence = spannableStringB.subSequence(0, i12);
        }
        spannableStringBuilder.append((CharSequence) spannableStringSubSequence);
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int length2 = i12 - spannableStringBuilder.length();
        int i16 = i11 - length2;
        if (i != Integer.MIN_VALUE) {
            i10 = i;
        } else if (this.f38868g != 2 || (Math.abs(i16) >= 3 && length2 >= 0)) {
            i10 = (this.f38868g != 2 || i16 <= 0) ? 0 : 2;
        } else {
            i10 = 1;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                i11 = 32 - length2;
            }
            f10 = ((i11 / 32.0f) * 0.8f) + 0.1f;
        } else {
            f10 = 0.5f;
        }
        float f11 = f10;
        int i17 = this.f38865d;
        if (i17 > 7) {
            i17 -= 17;
        } else if (this.f38868g == 1) {
            i17 -= this.f38869h - 1;
        }
        return new o20(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, null, i17, 1, VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR, f11, i10, VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR, 0.0f);
    }

    public final SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f38864c);
        int length = spannableStringBuilder.length();
        int i = -1;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = 0;
        int i14 = 0;
        boolean z5 = false;
        while (i13 < this.f38862a.size()) {
            ft ftVar = (ft) this.f38862a.get(i13);
            boolean z10 = ftVar.f38547b;
            int i15 = ftVar.f38546a;
            if (i15 != 8) {
                boolean z11 = i15 == 7;
                if (i15 != 7) {
                    i12 = ht.A[i15];
                }
                z5 = z11;
            }
            int i16 = ftVar.f38548c;
            i13++;
            if (i16 != (i13 < this.f38862a.size() ? ((ft) this.f38862a.get(i13)).f38548c : length)) {
                if (i != -1 && !z10) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i, i16, 33);
                    i = -1;
                } else if (i == -1 && z10) {
                    i = i16;
                }
                if (i10 != -1 && !z5) {
                    l7.o.o(2, spannableStringBuilder, i10, i16, 33);
                    i10 = -1;
                } else if (i10 == -1 && z5) {
                    i10 = i16;
                }
                if (i12 != i11) {
                    if (i11 != -1) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(i11), i14, i16, 33);
                    }
                    i14 = i16;
                    i11 = i12;
                }
            }
        }
        if (i != -1 && i != length) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
        }
        if (i10 != -1 && i10 != length) {
            l7.o.o(2, spannableStringBuilder, i10, length, 33);
        }
        if (i14 != length && i11 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i11), i14, length, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }
}
