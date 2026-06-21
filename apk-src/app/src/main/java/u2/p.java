package u2;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends SpannableStringBuilder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f34060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f34061c;

    public p(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f34061c = new ArrayList();
        f2.g.g(cls, "watcherClass cannot be null");
        this.f34060b = cls;
    }

    public final void a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f34061c;
            if (i >= arrayList.size()) {
                return;
            }
            ((o) arrayList.get(i)).f34059c.incrementAndGet();
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final void b() {
        e();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f34061c;
            if (i >= arrayList.size()) {
                return;
            }
            ((o) arrayList.get(i)).onTextChanged(this, 0, length(), length());
            i++;
        }
    }

    public final o c(Object obj) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f34061c;
            if (i >= arrayList.size()) {
                return null;
            }
            o oVar = (o) arrayList.get(i);
            if (oVar.f34058b == obj) {
                return oVar;
            }
            i++;
        }
    }

    public final boolean d(Object obj) {
        if (obj != null) {
            return this.f34060b == obj.getClass();
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i, int i10) {
        super.delete(i, i10);
        return this;
    }

    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f34061c;
            if (i >= arrayList.size()) {
                return;
            }
            ((o) arrayList.get(i)).f34059c.decrementAndGet();
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        o oVarC;
        if (d(obj) && (oVarC = c(obj)) != null) {
            obj = oVarC;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        o oVarC;
        if (d(obj) && (oVarC = c(obj)) != null) {
            obj = oVarC;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        o oVarC;
        if (d(obj) && (oVarC = c(obj)) != null) {
            obj = oVarC;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i, int i10, Class cls) {
        if (this.f34060b != cls) {
            return super.getSpans(i, i10, cls);
        }
        o[] oVarArr = (o[]) super.getSpans(i, i10, o.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, oVarArr.length);
        for (int i11 = 0; i11 < oVarArr.length; i11++) {
            objArr[i11] = oVarArr[i11].f34058b;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i, int i10, Class cls) {
        if (cls == null || this.f34060b == cls) {
            cls = o.class;
        }
        return super.nextSpanTransition(i, i10, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        o oVarC;
        if (d(obj)) {
            oVarC = c(obj);
            if (oVarC != null) {
                obj = oVarC;
            }
        } else {
            oVarC = null;
        }
        super.removeSpan(obj);
        if (oVarC != null) {
            this.f34061c.remove(oVarC);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i10, CharSequence charSequence) {
        replace(i, i10, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i, int i10, int i11) {
        if (d(obj)) {
            o oVar = new o(obj);
            this.f34061c.add(oVar);
            obj = oVar;
        }
        super.setSpan(obj, i, i10, i11);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i, int i10) {
        return new p(this.f34060b, this, i, i10);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i, int i10) {
        super.delete(i, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i10, CharSequence charSequence, int i11, int i12) {
        replace(i, i10, charSequence, i11, i12);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence, int i10, int i11) {
        super.insert(i, charSequence, i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i10, CharSequence charSequence) {
        a();
        super.replace(i, i10, charSequence);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c8) {
        super.append(c8);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence, int i10, int i11) {
        super.insert(i, charSequence, i10, i11);
        return this;
    }

    public p(Class cls, p pVar, int i, int i10) {
        super(pVar, i, i10);
        this.f34061c = new ArrayList();
        f2.g.g(cls, "watcherClass cannot be null");
        this.f34060b = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c8) {
        super.append(c8);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c8) {
        super.append(c8);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i10, CharSequence charSequence, int i11, int i12) {
        a();
        super.replace(i, i10, charSequence, i11, i12);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i, int i10) {
        super.append(charSequence, i, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i, int i10) {
        super.append(charSequence, i, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i10) {
        super.append(charSequence, i, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }
}
