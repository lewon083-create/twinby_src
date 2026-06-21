package com.monetization.ads.fullscreen.template.view;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yads.eg;
import yads.fg;
import yads.fz2;
import yads.jg;
import yads.jj1;
import yads.kj1;
import yads.og2;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class ExtendedTextView extends TextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private kj1 f15061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final eg f15062b;

    public ExtendedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, null, 28, null);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z5, int i, int i10, int i11, int i12) {
        eg egVar;
        super.onLayout(z5, i, i10, i11, i12);
        if (Build.VERSION.SDK_INT < 27 && (egVar = this.f15062b) != null) {
            egVar.f38123a.a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i10) {
        jj1 jj1VarA = this.f15061a.a(i, i10);
        super.onMeasure(jj1VarA.f39877a, jj1VarA.f39878b);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i10, int i11) {
        eg egVar;
        super.onTextChanged(charSequence, i, i10, i11);
        if (Build.VERSION.SDK_INT < 27 && (egVar = this.f15062b) != null) {
            egVar.f38123a.a();
        }
    }

    public final void setAutoSizeTextType(int i) {
        if (Build.VERSION.SDK_INT >= 27) {
            setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        eg egVar = this.f15062b;
        if (egVar != null) {
            jg jgVar = egVar.f38123a;
            if (jgVar.f39862g instanceof EditText) {
                return;
            }
            if (i == 0) {
                jgVar.f39856a = 0;
                jgVar.f39859d = -1.0f;
                jgVar.f39858c = -1.0f;
                jgVar.f39860e = new int[0];
                jgVar.f39857b = false;
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException(og2.a("Unknown auto-size text type: ", i));
            }
            DisplayMetrics displayMetrics = jgVar.f39863h.getResources().getDisplayMetrics();
            float fApplyDimension = TypedValue.applyDimension(2, 12.0f, displayMetrics);
            float fApplyDimension2 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
            if (fApplyDimension <= 0.0f) {
                throw new IllegalArgumentException("Minimum auto-size text size (" + fApplyDimension + "px) is less or equal to (0px)");
            }
            if (fApplyDimension2 <= fApplyDimension) {
                throw new IllegalArgumentException("Maximum auto-size text size (" + fApplyDimension2 + "px) is less or equal to minimum auto-size text size (" + fApplyDimension + "px)");
            }
            jgVar.f39856a = 1;
            jgVar.f39859d = fApplyDimension;
            jgVar.f39858c = 1.0f;
            if (jgVar.f39862g instanceof EditText) {
                jgVar.f39857b = false;
            } else {
                int iFloor = ((int) Math.floor((fApplyDimension2 - fApplyDimension) / 1.0f)) + 1;
                int[] iArr = new int[iFloor];
                for (int i10 = 0; i10 < iFloor; i10++) {
                    iArr[i10] = Math.round((i10 * jgVar.f39858c) + jgVar.f39859d);
                }
                if (iFloor != 0) {
                    Arrays.sort(iArr);
                    ArrayList arrayList = new ArrayList();
                    for (int i11 = 0; i11 < iFloor; i11++) {
                        int i12 = iArr[i11];
                        if (i12 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i12)) < 0) {
                            arrayList.add(Integer.valueOf(i12));
                        }
                    }
                    if (iFloor != arrayList.size()) {
                        int size = arrayList.size();
                        iArr = new int[size];
                        for (int i13 = 0; i13 < size; i13++) {
                            iArr[i13] = ((Integer) arrayList.get(i13)).intValue();
                        }
                    }
                }
                jgVar.f39860e = iArr;
                jgVar.f39857b = true;
            }
            if (jgVar.f39857b) {
                jgVar.a();
            }
        }
    }

    public final void setMeasureSpecProvider(kj1 kj1Var) {
        this.f15061a = kj1Var;
        requestLayout();
        invalidate();
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f10) {
        if (Build.VERSION.SDK_INT >= 27) {
            super.setTextSize(i, f10);
            return;
        }
        eg egVar = this.f15062b;
        if (egVar != null) {
            jg jgVar = egVar.f38123a;
            if ((jgVar.f39862g instanceof EditText) || jgVar.f39856a == 0) {
                jgVar.a(i, f10);
            }
        }
    }

    public ExtendedTextView(Context context, AttributeSet attributeSet, int i, kj1 kj1Var, fg fgVar) {
        super(context, attributeSet, i);
        this.f15061a = kj1Var;
        fgVar.getClass();
        this.f15062b = fg.a(this);
    }

    public /* synthetic */ ExtendedTextView(Context context, AttributeSet attributeSet, int i, kj1 kj1Var, fg fgVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 0 : i, (i10 & 8) != 0 ? new fz2() : kj1Var, (i10 & 16) != 0 ? new fg() : fgVar);
    }
}
