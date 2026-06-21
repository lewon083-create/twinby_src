package yads;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class x93 {
    public static void a(SpannableStringBuilder spannableStringBuilder, int i, int i10, y93 y93Var, v93 v93Var, Map map, int i11) {
        v93 v93Var2;
        int i12 = y93Var.f44973h;
        if (i12 != -1 || y93Var.i != -1) {
            if (((i12 == 1 ? (char) 1 : (char) 0) | (y93Var.i == 1 ? (char) 2 : (char) 0)) != -1) {
                int i13 = y93Var.f44973h;
                spannableStringBuilder.setSpan(new StyleSpan((i13 == -1 && y93Var.i == -1) ? -1 : (i13 == 1 ? 1 : 0) | (y93Var.i == 1 ? 2 : 0)), i, i10, 33);
            }
        }
        if (y93Var.f44971f == 1) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i10, 33);
        }
        if (y93Var.f44972g == 1) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i10, 33);
        }
        if (y93Var.f44968c) {
            if (!y93Var.f44968c) {
                throw new IllegalStateException("Font color has not been defined.");
            }
            h23.a(spannableStringBuilder, new ForegroundColorSpan(y93Var.f44967b), i, i10);
        }
        if (y93Var.f44970e) {
            if (!y93Var.f44970e) {
                throw new IllegalStateException("Background color has not been defined.");
            }
            h23.a(spannableStringBuilder, new BackgroundColorSpan(y93Var.f44969d), i, i10);
        }
        if (y93Var.f44966a != null) {
            h23.a(spannableStringBuilder, new TypefaceSpan(y93Var.f44966a), i, i10);
        }
        if (y93Var.f44982r != null) {
            h23.a(spannableStringBuilder, new z53(), i, i10);
        }
        int i14 = y93Var.f44977m;
        if (i14 == 2) {
            v93 v93Var3 = v93Var;
            while (true) {
                if (v93Var3 == null) {
                    v93Var3 = null;
                    break;
                }
                y93 y93VarA = a(v93Var3.f43964f, v93Var3.f43965g, map);
                if (y93VarA != null && y93VarA.f44977m == 1) {
                    break;
                } else {
                    v93Var3 = v93Var3.f43967j;
                }
            }
            if (v93Var3 != null) {
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(v93Var3);
                while (true) {
                    if (arrayDeque.isEmpty()) {
                        v93Var2 = null;
                        break;
                    }
                    v93 v93Var4 = (v93) arrayDeque.pop();
                    y93 y93VarA2 = a(v93Var4.f43964f, v93Var4.f43965g, map);
                    if (y93VarA2 != null && y93VarA2.f44977m == 3) {
                        v93Var2 = v93Var4;
                        break;
                    }
                    ArrayList arrayList = v93Var4.f43970m;
                    for (int size = (arrayList == null ? 0 : arrayList.size()) - 1; size >= 0; size--) {
                        arrayDeque.push(v93Var4.a(size));
                    }
                }
                if (v93Var2 != null) {
                    ArrayList arrayList2 = v93Var2.f43970m;
                    if (arrayList2 == null || arrayList2.size() != 1 || v93Var2.a(0).f43960b == null) {
                        kh1.c("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                    } else {
                        String str = v93Var2.a(0).f43960b;
                        int i15 = lb3.f40466a;
                        y93 y93VarA3 = a(v93Var2.f43964f, v93Var2.f43965g, map);
                        if (y93VarA3 == null || y93VarA3.f44978n == -1) {
                            a(v93Var3.f43964f, v93Var3.f43965g, map);
                        }
                        spannableStringBuilder.setSpan(new bs2(), i, i10, 33);
                    }
                }
            }
        } else if (i14 == 3 || i14 == 4) {
            spannableStringBuilder.setSpan(new vf0(), i, i10, 33);
        }
        if (y93Var.f44981q == 1) {
            h23.a(spannableStringBuilder, new d11(), i, i10);
        }
        int i16 = y93Var.f44974j;
        if (i16 == 1) {
            h23.a(spannableStringBuilder, new AbsoluteSizeSpan((int) y93Var.f44975k, true), i, i10);
        } else if (i16 == 2) {
            h23.a(spannableStringBuilder, new RelativeSizeSpan(y93Var.f44975k), i, i10);
        } else {
            if (i16 != 3) {
                return;
            }
            h23.a(spannableStringBuilder, new RelativeSizeSpan(y93Var.f44975k / 100.0f), i, i10);
        }
    }

    public static y93 a(y93 y93Var, String[] strArr, Map map) {
        int i = 0;
        if (y93Var == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (y93) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                y93 y93Var2 = new y93();
                int length = strArr.length;
                while (i < length) {
                    y93Var2.a((y93) map.get(strArr[i]));
                    i++;
                }
                return y93Var2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                return y93Var.a((y93) map.get(strArr[0]));
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    y93Var.a((y93) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return y93Var;
    }
}
