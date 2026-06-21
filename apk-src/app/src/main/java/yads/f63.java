package yads;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class f63 extends Spannable.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f38386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f38387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f38388c;

    public f63(Drawable drawable, int i, int i10) {
        this.f38386a = drawable;
        this.f38387b = i;
        this.f38388c = i10;
    }

    @Override // android.text.Spannable.Factory
    public final Spannable newSpannable(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.f38386a != null && this.f38387b > 0) {
            spannableStringBuilder.append((CharSequence) "  ");
            Drawable drawable = this.f38386a;
            int i = this.f38387b;
            drawable.setBounds(0, 0, i, i);
            oe oeVar = new oe(drawable);
            ColorDrawable colorDrawable = new ColorDrawable(0);
            int i10 = this.f38388c;
            colorDrawable.setBounds(0, 0, i10, i10);
            oe oeVar2 = new oe(colorDrawable);
            spannableStringBuilder.setSpan(oeVar, 0, 1, 33);
            spannableStringBuilder.setSpan(oeVar2, 1, 2, 33);
        }
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }
}
