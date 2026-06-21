package io.flutter.plugin.editing;

import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import hi.m;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends SpannableStringBuilder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25638b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25639c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f25640d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f25641e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f25642f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f25643g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f25644h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f25645j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f25646k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f25647l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d f25648m;

    public f(m mVar, View view) {
        this.f25648m = new d(view, this);
        if (mVar != null) {
            f(mVar);
        }
    }

    public final void a(e eVar) {
        if (this.f25639c > 0) {
            Log.e("ListenableEditingState", "adding a listener " + eVar.toString() + " in a listener callback");
        }
        if (this.f25638b <= 0) {
            this.f25640d.add(eVar);
        } else {
            Log.w("ListenableEditingState", "a listener was added to EditingState while a batch edit was in progress");
            this.f25641e.add(eVar);
        }
    }

    public final void b() {
        this.f25638b++;
        if (this.f25639c > 0) {
            Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        if (this.f25638b != 1 || this.f25640d.isEmpty()) {
            return;
        }
        this.f25644h = toString();
        this.i = Selection.getSelectionStart(this);
        this.f25645j = Selection.getSelectionEnd(this);
        this.f25646k = BaseInputConnection.getComposingSpanStart(this);
        this.f25647l = BaseInputConnection.getComposingSpanEnd(this);
    }

    public final void c() {
        int i = this.f25638b;
        if (i == 0) {
            Log.e("ListenableEditingState", "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        ArrayList arrayList = this.f25640d;
        ArrayList<e> arrayList2 = this.f25641e;
        if (i == 1) {
            for (e eVar : arrayList2) {
                this.f25639c++;
                eVar.a(true);
                this.f25639c--;
            }
            if (!arrayList.isEmpty()) {
                arrayList.size();
                d(!toString().equals(this.f25644h), (this.i == Selection.getSelectionStart(this) && this.f25645j == Selection.getSelectionEnd(this)) ? false : true, (this.f25646k == BaseInputConnection.getComposingSpanStart(this) && this.f25647l == BaseInputConnection.getComposingSpanEnd(this)) ? false : true);
            }
        }
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        this.f25638b--;
    }

    public final void d(boolean z5, boolean z10, boolean z11) {
        if (z5 || z10 || z11) {
            for (e eVar : this.f25640d) {
                this.f25639c++;
                eVar.a(z5);
                this.f25639c--;
            }
        }
    }

    public final void e(e eVar) {
        if (this.f25639c > 0) {
            Log.e("ListenableEditingState", "removing a listener " + eVar.toString() + " in a listener callback");
        }
        this.f25640d.remove(eVar);
        if (this.f25638b > 0) {
            this.f25641e.remove(eVar);
        }
    }

    public final void f(m mVar) {
        b();
        replace(0, length(), (CharSequence) mVar.f20623a);
        int i = mVar.f20624b;
        if (i >= 0) {
            Selection.setSelection(this, i, mVar.f20625c);
        } else {
            Selection.removeSelection(this);
        }
        int i10 = mVar.f20626d;
        int i11 = mVar.f20627e;
        if (i10 < 0 || i10 >= i11) {
            BaseInputConnection.removeComposingSpans(this);
        } else {
            this.f25648m.setComposingRegion(i10, i11);
        }
        this.f25642f.clear();
        c();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i, int i10, int i11) {
        super.setSpan(obj, i, i10, i11);
        String string = toString();
        int selectionStart = Selection.getSelectionStart(this);
        int selectionEnd = Selection.getSelectionEnd(this);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(this);
        h hVar = new h();
        hVar.f25657e = selectionStart;
        hVar.f25658f = selectionEnd;
        hVar.f25659g = composingSpanStart;
        hVar.f25660h = composingSpanEnd;
        hVar.f25653a = string;
        hVar.f25654b = "";
        hVar.f25655c = -1;
        hVar.f25656d = -1;
        this.f25642f.add(hVar);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final String toString() {
        String str = this.f25643g;
        if (str != null) {
            return str;
        }
        String string = super.toString();
        this.f25643g = string;
        return string;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i10, CharSequence charSequence, int i11, int i12) {
        if (this.f25639c > 0) {
            Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        String string = toString();
        int i13 = i10 - i;
        boolean z5 = i13 != i12 - i11;
        for (int i14 = 0; i14 < i13 && !z5; i14++) {
            z5 |= charAt(i + i14) != charSequence.charAt(i11 + i14);
        }
        if (z5) {
            this.f25643g = null;
        }
        int selectionStart = Selection.getSelectionStart(this);
        int selectionEnd = Selection.getSelectionEnd(this);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(this);
        SpannableStringBuilder spannableStringBuilderReplace = super.replace(i, i10, charSequence, i11, i12);
        int selectionStart2 = Selection.getSelectionStart(this);
        int selectionEnd2 = Selection.getSelectionEnd(this);
        int composingSpanStart2 = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd2 = BaseInputConnection.getComposingSpanEnd(this);
        h hVar = new h();
        hVar.f25657e = selectionStart2;
        hVar.f25658f = selectionEnd2;
        hVar.f25659g = composingSpanStart2;
        hVar.f25660h = composingSpanEnd2;
        String string2 = charSequence.toString();
        hVar.f25653a = string;
        hVar.f25654b = string2;
        hVar.f25655c = i;
        hVar.f25656d = i10;
        this.f25642f.add(hVar);
        if (this.f25638b > 0) {
            return spannableStringBuilderReplace;
        }
        d(z5, (Selection.getSelectionStart(this) == selectionStart && Selection.getSelectionEnd(this) == selectionEnd) ? false : true, (BaseInputConnection.getComposingSpanStart(this) == composingSpanStart && BaseInputConnection.getComposingSpanEnd(this) == composingSpanEnd) ? false : true);
        return spannableStringBuilderReplace;
    }
}
