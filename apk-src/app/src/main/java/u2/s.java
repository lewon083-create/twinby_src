package u2;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;
import t9.h0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements Spannable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f34065b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Spannable f34066c;

    public s(Spannable spannable) {
        this.f34066c = spannable;
    }

    public final void a() {
        Spannable spannable = this.f34066c;
        if (!this.f34065b) {
            if ((Build.VERSION.SDK_INT < 28 ? new h0() : new r()).h(spannable)) {
                this.f34066c = new SpannableString(spannable);
            }
        }
        this.f34065b = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f34066c.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f34066c.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f34066c.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f34066c.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f34066c.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f34066c.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i10, Class cls) {
        return this.f34066c.getSpans(i, i10, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f34066c.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i10, Class cls) {
        return this.f34066c.nextSpanTransition(i, i10, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f34066c.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i10, int i11) {
        a();
        this.f34066c.setSpan(obj, i, i10, i11);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i10) {
        return this.f34066c.subSequence(i, i10);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f34066c.toString();
    }

    public s(CharSequence charSequence) {
        this.f34066c = new SpannableString(charSequence);
    }
}
