package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import com.twinby.R;
import g2.n0;
import il.i;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import ka.k;
import m.b2;
import m.c2;
import m.d2;
import m.e2;
import m.f2;
import m.g2;
import m.h1;
import m.h2;
import m.i1;
import m.i2;
import m.j2;
import m.k2;
import m.l2;
import m.n;
import m.n2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class SearchView extends h1 implements k.a {
    public static final i h0;
    public final Rect A;
    public final Rect B;
    public final int[] C;
    public final int[] D;
    public final ImageView E;
    public final Drawable F;
    public final int G;
    public final int H;
    public final Intent I;
    public final Intent J;
    public final CharSequence K;
    public View.OnFocusChangeListener L;
    public View.OnClickListener M;
    public boolean N;
    public boolean O;
    public k2.b P;
    public boolean Q;
    public CharSequence R;
    public boolean S;
    public boolean T;
    public int U;
    public boolean V;
    public CharSequence W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f1142a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f1143b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public SearchableInfo f1144c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public Bundle f1145d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final c2 f1146e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final c2 f1147f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final WeakHashMap f1148g0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final SearchAutoComplete f1149q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final View f1150r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final View f1151s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final View f1152t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ImageView f1153u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ImageView f1154v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ImageView f1155w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ImageView f1156x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final View f1157y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public l2 f1158z;

    static {
        i iVar = null;
        if (Build.VERSION.SDK_INT < 29) {
            i iVar2 = new i();
            iVar2.f21381a = null;
            iVar2.f21382b = null;
            iVar2.f21383c = null;
            i.a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                iVar2.f21381a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                iVar2.f21382b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                iVar2.f21383c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            iVar = iVar2;
        }
        h0 = iVar;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.f1149q;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.T = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f1149q;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.T = false;
    }

    public int getImeOptions() {
        return this.f1149q.getImeOptions();
    }

    public int getInputType() {
        return this.f1149q.getInputType();
    }

    public int getMaxWidth() {
        return this.U;
    }

    public CharSequence getQuery() {
        return this.f1149q.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.R;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f1144c0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.K : getContext().getText(this.f1144c0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.H;
    }

    public int getSuggestionRowLayout() {
        return this.G;
    }

    public k2.b getSuggestionsAdapter() {
        return this.P;
    }

    public final Intent i(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.W);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f1145d0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f1144c0.getSearchActivity());
        return intent;
    }

    public final Intent j(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1145d0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void k() {
        int i = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.f1149q;
        if (i >= 29) {
            c.a(searchAutoComplete);
            return;
        }
        i iVar = h0;
        iVar.getClass();
        i.a();
        Method method = iVar.f21381a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, null);
            } catch (Exception unused) {
            }
        }
        iVar.getClass();
        i.a();
        Method method2 = iVar.f21382b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, null);
            } catch (Exception unused2) {
            }
        }
    }

    public final void l() {
        SearchAutoComplete searchAutoComplete = this.f1149q;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.N) {
            clearFocus();
            v(true);
        }
    }

    public final void m(int i) {
        int position;
        String strJ;
        Cursor cursor = this.P.f26834d;
        if (cursor != null && cursor.moveToPosition(i)) {
            Intent intentI = null;
            try {
                int i10 = n2.f28309y;
                String strJ2 = n2.j(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (strJ2 == null) {
                    strJ2 = this.f1144c0.getSuggestIntentAction();
                }
                if (strJ2 == null) {
                    strJ2 = "android.intent.action.SEARCH";
                }
                String strJ3 = n2.j(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (strJ3 == null) {
                    strJ3 = this.f1144c0.getSuggestIntentData();
                }
                if (strJ3 != null && (strJ = n2.j(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    strJ3 = strJ3 + "/" + Uri.encode(strJ);
                }
                intentI = i(strJ2, strJ3 == null ? null : Uri.parse(strJ3), n2.j(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), n2.j(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e3) {
                try {
                    position = cursor.getPosition();
                } catch (RuntimeException unused) {
                    position = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e3);
            }
            if (intentI != null) {
                try {
                    getContext().startActivity(intentI);
                } catch (RuntimeException e7) {
                    Log.e("SearchView", "Failed launch activity: " + intentI, e7);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.f1149q;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void n(int i) {
        Editable text = this.f1149q.getText();
        Cursor cursor = this.P.f26834d;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i)) {
            setQuery(text);
            return;
        }
        String strC = this.P.c(cursor);
        if (strC != null) {
            setQuery(strC);
        } else {
            setQuery(text);
        }
    }

    public final void o(CharSequence charSequence) {
        setQuery(charSequence);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f1146e0);
        post(this.f1147f0);
        super.onDetachedFromWindow();
    }

    @Override // m.h1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i, int i10, int i11, int i12) {
        super.onLayout(z5, i, i10, i11, i12);
        if (z5) {
            SearchAutoComplete searchAutoComplete = this.f1149q;
            int[] iArr = this.C;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.D;
            getLocationInWindow(iArr2);
            int i13 = iArr[1] - iArr2[1];
            int i14 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i14;
            int height = searchAutoComplete.getHeight() + i13;
            Rect rect = this.A;
            rect.set(i14, i13, width, height);
            int i15 = rect.left;
            int i16 = rect.right;
            int i17 = i12 - i10;
            Rect rect2 = this.B;
            rect2.set(i15, 0, i16, i17);
            l2 l2Var = this.f1158z;
            if (l2Var == null) {
                l2 l2Var2 = new l2(rect2, rect, searchAutoComplete);
                this.f1158z = l2Var2;
                setTouchDelegate(l2Var2);
            } else {
                l2Var.f28293b.set(rect2);
                Rect rect3 = l2Var.f28295d;
                rect3.set(rect2);
                int i18 = -l2Var.f28296e;
                rect3.inset(i18, i18);
                l2Var.f28294c.set(rect);
            }
        }
    }

    @Override // m.h1, android.view.View
    public final void onMeasure(int i, int i10) {
        int i11;
        if (this.O) {
            super.onMeasure(i, i10);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i12 = this.U;
            size = i12 > 0 ? Math.min(i12, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.U;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i11 = this.U) > 0) {
            size = Math.min(i11, size);
        }
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof k2)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        k2 k2Var = (k2) parcelable;
        super.onRestoreInstanceState(k2Var.f28536b);
        v(k2Var.f28283d);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        k2 k2Var = new k2(super.onSaveInstanceState());
        k2Var.f28283d = this.O;
        return k2Var;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z5) {
        super.onWindowFocusChanged(z5);
        post(this.f1146e0);
    }

    public final void p() {
        SearchAutoComplete searchAutoComplete = this.f1149q;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.f1144c0 != null) {
            getContext().startActivity(i("android.intent.action.SEARCH", null, null, text.toString()));
        }
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void q() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f1149q.getText());
        int i = (!zIsEmpty || (this.N && !this.f1142a0)) ? 0 : 8;
        ImageView imageView = this.f1155w;
        imageView.setVisibility(i);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public final void r() {
        int[] iArr = this.f1149q.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f1151s.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f1152t.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (this.T || !isFocusable()) {
            return false;
        }
        if (this.O) {
            return super.requestFocus(i, rect);
        }
        boolean zRequestFocus = this.f1149q.requestFocus(i, rect);
        if (zRequestFocus) {
            v(false);
        }
        return zRequestFocus;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void s() {
        CharSequence queryHint = getQueryHint();
        CharSequence charSequence = queryHint;
        if (queryHint == null) {
            charSequence = "";
        }
        boolean z5 = this.N;
        SearchAutoComplete searchAutoComplete = this.f1149q;
        CharSequence charSequence2 = charSequence;
        if (z5) {
            Drawable drawable = this.F;
            charSequence2 = charSequence;
            if (drawable != null) {
                int textSize = (int) (((double) searchAutoComplete.getTextSize()) * 1.25d);
                drawable.setBounds(0, 0, textSize, textSize);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
                spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
                spannableStringBuilder.append(charSequence);
                charSequence2 = spannableStringBuilder;
            }
        }
        searchAutoComplete.setHint(charSequence2);
    }

    public void setAppSearchData(Bundle bundle) {
        this.f1145d0 = bundle;
    }

    public void setIconified(boolean z5) {
        if (z5) {
            l();
            return;
        }
        v(false);
        SearchAutoComplete searchAutoComplete = this.f1149q;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.M;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z5) {
        if (this.N == z5) {
            return;
        }
        this.N = z5;
        v(z5);
        s();
    }

    public void setImeOptions(int i) {
        this.f1149q.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f1149q.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.U = i;
        requestLayout();
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.L = onFocusChangeListener;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.M = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.R = charSequence;
        s();
    }

    public void setQueryRefinementEnabled(boolean z5) {
        this.S = z5;
        k2.b bVar = this.P;
        if (bVar instanceof n2) {
            ((n2) bVar).f28317q = z5 ? 2 : 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setSearchableInfo(android.app.SearchableInfo r7) {
        /*
            r6 = this;
            r6.f1144c0 = r7
            r0 = 0
            r1 = 1
            androidx.appcompat.widget.SearchView$SearchAutoComplete r2 = r6.f1149q
            if (r7 == 0) goto L65
            int r7 = r7.getSuggestThreshold()
            r2.setThreshold(r7)
            android.app.SearchableInfo r7 = r6.f1144c0
            int r7 = r7.getImeOptions()
            r2.setImeOptions(r7)
            android.app.SearchableInfo r7 = r6.f1144c0
            int r7 = r7.getInputType()
            r3 = r7 & 15
            if (r3 != r1) goto L31
            r3 = -65537(0xfffffffffffeffff, float:NaN)
            r7 = r7 & r3
            android.app.SearchableInfo r3 = r6.f1144c0
            java.lang.String r3 = r3.getSuggestAuthority()
            if (r3 == 0) goto L31
            r3 = 589824(0x90000, float:8.2652E-40)
            r7 = r7 | r3
        L31:
            r2.setInputType(r7)
            k2.b r7 = r6.P
            if (r7 == 0) goto L3b
            r7.b(r0)
        L3b:
            android.app.SearchableInfo r7 = r6.f1144c0
            java.lang.String r7 = r7.getSuggestAuthority()
            if (r7 == 0) goto L62
            m.n2 r7 = new m.n2
            android.content.Context r3 = r6.getContext()
            android.app.SearchableInfo r4 = r6.f1144c0
            java.util.WeakHashMap r5 = r6.f1148g0
            r7.<init>(r3, r6, r4, r5)
            r6.P = r7
            r2.setAdapter(r7)
            k2.b r7 = r6.P
            m.n2 r7 = (m.n2) r7
            boolean r3 = r6.S
            if (r3 == 0) goto L5f
            r3 = 2
            goto L60
        L5f:
            r3 = r1
        L60:
            r7.f28317q = r3
        L62:
            r6.s()
        L65:
            android.app.SearchableInfo r7 = r6.f1144c0
            r3 = 0
            if (r7 == 0) goto L98
            boolean r7 = r7.getVoiceSearchEnabled()
            if (r7 == 0) goto L98
            android.app.SearchableInfo r7 = r6.f1144c0
            boolean r7 = r7.getVoiceSearchLaunchWebSearch()
            if (r7 == 0) goto L7b
            android.content.Intent r0 = r6.I
            goto L85
        L7b:
            android.app.SearchableInfo r7 = r6.f1144c0
            boolean r7 = r7.getVoiceSearchLaunchRecognizer()
            if (r7 == 0) goto L85
            android.content.Intent r0 = r6.J
        L85:
            if (r0 == 0) goto L98
            android.content.Context r7 = r6.getContext()
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            r4 = 65536(0x10000, float:9.1835E-41)
            android.content.pm.ResolveInfo r7 = r7.resolveActivity(r0, r4)
            if (r7 == 0) goto L98
            goto L99
        L98:
            r1 = r3
        L99:
            r6.V = r1
            if (r1 == 0) goto La2
            java.lang.String r7 = "nm"
            r2.setPrivateImeOptions(r7)
        La2:
            boolean r7 = r6.O
            r6.v(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z5) {
        this.Q = z5;
        v(this.O);
    }

    public void setSuggestionsAdapter(k2.b bVar) {
        this.P = bVar;
        this.f1149q.setAdapter(bVar);
    }

    public final void t() {
        this.f1152t.setVisibility(((this.Q || this.V) && !this.O && (this.f1154v.getVisibility() == 0 || this.f1156x.getVisibility() == 0)) ? 0 : 8);
    }

    public final void u(boolean z5) {
        boolean z10 = this.Q;
        this.f1154v.setVisibility((!z10 || !(z10 || this.V) || this.O || !hasFocus() || (!z5 && this.V)) ? 8 : 0);
    }

    public final void v(boolean z5) {
        this.O = z5;
        int i = 8;
        int i10 = z5 ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.f1149q.getText());
        this.f1153u.setVisibility(i10);
        u(!zIsEmpty);
        this.f1150r.setVisibility(z5 ? 8 : 0);
        ImageView imageView = this.E;
        imageView.setVisibility((imageView.getDrawable() == null || this.N) ? 8 : 0);
        q();
        if (this.V && !this.O && zIsEmpty) {
            this.f1154v.setVisibility(8);
            i = 0;
        }
        this.f1156x.setVisibility(i);
        t();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A = new Rect();
        this.B = new Rect();
        this.C = new int[2];
        this.D = new int[2];
        this.f1146e0 = new c2(this, 0);
        this.f1147f0 = new c2(this, 1);
        this.f1148g0 = new WeakHashMap();
        a aVar = new a(this);
        b bVar = new b(this);
        f2 f2Var = new f2(this);
        g2 g2Var = new g2(this);
        i1 i1Var = new i1(1, this);
        b2 b2Var = new b2(this);
        int[] iArr = h.a.f20309r;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        k kVar = new k(context, typedArrayObtainStyledAttributes);
        n0.j(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i);
        LayoutInflater.from(context).inflate(typedArrayObtainStyledAttributes.getResourceId(17, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f1149q = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f1150r = findViewById(R.id.search_edit_frame);
        View viewFindViewById = findViewById(R.id.search_plate);
        this.f1151s = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.submit_area);
        this.f1152t = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f1153u = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f1154v = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f1155w = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f1156x = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.E = imageView5;
        viewFindViewById.setBackground(kVar.F(18));
        viewFindViewById2.setBackground(kVar.F(23));
        imageView.setImageDrawable(kVar.F(21));
        imageView2.setImageDrawable(kVar.F(13));
        imageView3.setImageDrawable(kVar.F(10));
        imageView4.setImageDrawable(kVar.F(26));
        imageView5.setImageDrawable(kVar.F(21));
        this.F = kVar.F(20);
        a.a.p(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.G = typedArrayObtainStyledAttributes.getResourceId(24, R.layout.abc_search_dropdown_item_icons_2line);
        this.H = typedArrayObtainStyledAttributes.getResourceId(11, 0);
        imageView.setOnClickListener(aVar);
        imageView3.setOnClickListener(aVar);
        imageView2.setOnClickListener(aVar);
        imageView4.setOnClickListener(aVar);
        searchAutoComplete.setOnClickListener(aVar);
        searchAutoComplete.addTextChangedListener(b2Var);
        searchAutoComplete.setOnEditorActionListener(f2Var);
        searchAutoComplete.setOnItemClickListener(g2Var);
        searchAutoComplete.setOnItemSelectedListener(i1Var);
        searchAutoComplete.setOnKeyListener(bVar);
        searchAutoComplete.setOnFocusChangeListener(new d2(this));
        setIconifiedByDefault(typedArrayObtainStyledAttributes.getBoolean(16, true));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.K = typedArrayObtainStyledAttributes.getText(12);
        this.R = typedArrayObtainStyledAttributes.getText(19);
        int i10 = typedArrayObtainStyledAttributes.getInt(6, -1);
        if (i10 != -1) {
            setImeOptions(i10);
        }
        int i11 = typedArrayObtainStyledAttributes.getInt(5, -1);
        if (i11 != -1) {
            setInputType(i11);
        }
        setFocusable(typedArrayObtainStyledAttributes.getBoolean(1, true));
        kVar.Q();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.I = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.J = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f1157y = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new e2(this));
        }
        v(this.N);
        s();
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static class SearchAutoComplete extends n {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f1159f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public SearchView f1160g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f1161h;
        public final d i;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.i = new d(this);
            this.f1159f = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i10 = configuration.screenHeightDp;
            if (i >= 960 && i10 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                return (i < 640 || i10 < 480) ? 160 : 192;
            }
            return 192;
        }

        public final void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                c.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            i iVar = SearchView.h0;
            iVar.getClass();
            i.a();
            Method method = iVar.f21383c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.f1159f <= 0 || super.enoughToFilter();
        }

        @Override // m.n, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f1161h) {
                d dVar = this.i;
                removeCallbacks(dVar);
                post(dVar);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z5, int i, Rect rect) {
            super.onFocusChanged(z5, i, rect);
            SearchView searchView = this.f1160g;
            searchView.v(searchView.O);
            searchView.post(searchView.f1146e0);
            if (searchView.f1149q.hasFocus()) {
                searchView.k();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f1160g.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z5) {
            super.onWindowFocusChanged(z5);
            if (z5 && this.f1160g.hasFocus() && getVisibility() == 0) {
                this.f1161h = true;
                Context context = getContext();
                i iVar = SearchView.h0;
                if (context.getResources().getConfiguration().orientation == 2) {
                    a();
                }
            }
        }

        public void setImeVisibility(boolean z5) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            d dVar = this.i;
            if (!z5) {
                this.f1161h = false;
                removeCallbacks(dVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f1161h = true;
                    return;
                }
                this.f1161h = false;
                removeCallbacks(dVar);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f1160g = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f1159f = i;
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }
    }

    public void setOnCloseListener(h2 h2Var) {
    }

    public void setOnQueryTextListener(i2 i2Var) {
    }

    public void setOnSuggestionListener(j2 j2Var) {
    }
}
