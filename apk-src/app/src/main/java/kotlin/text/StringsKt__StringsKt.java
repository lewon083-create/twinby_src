package kotlin.text;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: Access modifiers changed from: package-private */
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
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public class StringsKt__StringsKt extends a0 {
    public static final int o(int i, CharSequence charSequence, String string, boolean z5) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        return (z5 || !(charSequence instanceof String)) ? p(charSequence, string, i, charSequence.length(), z5, false) : ((String) charSequence).indexOf(string, i);
    }

    public static final int p(CharSequence charSequence, CharSequence charSequence2, int i, int i10, boolean z5, boolean z10) {
        kotlin.ranges.a aVar;
        if (z10) {
            int iA = StringsKt.A(charSequence);
            if (i > iA) {
                i = iA;
            }
            if (i10 < 0) {
                i10 = 0;
            }
            kotlin.ranges.a.f27525e.getClass();
            aVar = new kotlin.ranges.a(i, i10, -1);
        } else {
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length();
            if (i10 > length) {
                i10 = length;
            }
            aVar = new IntRange(i, i10, 1);
        }
        boolean z11 = charSequence instanceof String;
        int i11 = aVar.f27528d;
        int i12 = aVar.f27527c;
        int i13 = aVar.f27526b;
        if (!z11 || !(charSequence2 instanceof String)) {
            boolean z12 = z5;
            if ((i11 > 0 && i13 <= i12) || (i11 < 0 && i12 <= i13)) {
                while (true) {
                    CharSequence charSequence3 = charSequence;
                    CharSequence charSequence4 = charSequence2;
                    boolean z13 = z12;
                    z12 = z13;
                    if (!r(charSequence4, 0, charSequence3, i13, charSequence2.length(), z13)) {
                        if (i13 == i12) {
                            break;
                        }
                        i13 += i11;
                        charSequence2 = charSequence4;
                        charSequence = charSequence3;
                    } else {
                        return i13;
                    }
                }
            }
        } else if ((i11 > 0 && i13 <= i12) || (i11 < 0 && i12 <= i13)) {
            int i14 = i13;
            while (true) {
                String str = (String) charSequence2;
                boolean z14 = z5;
                if (!a0.j(0, i14, str.length(), str, (String) charSequence, z14)) {
                    if (i14 == i12) {
                        break;
                    }
                    i14 += i11;
                    z5 = z14;
                } else {
                    return i14;
                }
            }
        }
        return -1;
    }

    public static final int q(CharSequence charSequence, char[] chars, int i, boolean z5) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        if (!z5 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(kotlin.collections.p.s(chars), i);
        }
        if (i < 0) {
            i = 0;
        }
        int iA = StringsKt.A(charSequence);
        if (i > iA) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i);
            for (char c8 : chars) {
                if (a.a(c8, cCharAt, z5)) {
                    return i;
                }
            }
            if (i == iA) {
                return -1;
            }
            i++;
        }
    }

    public static final boolean r(CharSequence charSequence, int i, CharSequence other, int i10, int i11, boolean z5) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (i10 < 0 || i < 0 || i > charSequence.length() - i11 || i10 > other.length() - i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (!a.a(charSequence.charAt(i + i12), other.charAt(i10 + i12), z5)) {
                return false;
            }
        }
        return true;
    }

    public static final void s(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(l7.o.i(i, "Limit must be non-negative, but was ").toString());
        }
    }

    public static List split$default(CharSequence charSequence, String[] delimiters, final boolean z5, int i, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z5 = false;
        }
        if ((i10 & 4) != 0) {
            i = 0;
        }
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        if (delimiters.length == 1) {
            String str = delimiters[0];
            if (str.length() != 0) {
                return t(i, charSequence, str, z5);
            }
        }
        s(i);
        final List listC = kotlin.collections.o.c(delimiters);
        c cVar = new c(charSequence, i, new Function2() { // from class: kotlin.text.c0
            /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[EDGE_INSN: B:75:0x006a->B:23:0x006a BREAK  A[LOOP:0: B:39:0x00a5->B:51:0x00de], EDGE_INSN: B:79:0x006a->B:23:0x006a BREAK  A[LOOP:2: B:58:0x00eb->B:69:0x011d]] */
            /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[EDGE_INSN: B:75:0x006a->B:23:0x006a BREAK  A[LOOP:0: B:39:0x00a5->B:51:0x00de]] */
            @Override // kotlin.jvm.functions.Function2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke(java.lang.Object r13, java.lang.Object r14) {
                /*
                    Method dump skipped, instruction units count: 310
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.text.c0.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        });
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        ek.s sVar = new ek.s(0, cVar);
        ArrayList arrayList = new ArrayList(kotlin.collections.t.j(sVar, 10));
        Iterator it = sVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return arrayList;
            }
            IntRange range = (IntRange) bVar.next();
            Intrinsics.checkNotNullParameter(charSequence, "<this>");
            Intrinsics.checkNotNullParameter(range, "range");
            arrayList.add(charSequence.subSequence(range.f27526b, range.f27527c + 1).toString());
        }
    }

    public static final List t(int i, CharSequence charSequence, String str, boolean z5) {
        s(i);
        int length = 0;
        int iO = o(0, charSequence, str, z5);
        if (iO == -1 || i == 1) {
            return kotlin.collections.r.c(charSequence.toString());
        }
        boolean z10 = i > 0;
        int i10 = 10;
        if (z10 && i <= 10) {
            i10 = i;
        }
        ArrayList arrayList = new ArrayList(i10);
        do {
            arrayList.add(charSequence.subSequence(length, iO).toString());
            length = str.length() + iO;
            if (z10 && arrayList.size() == i - 1) {
                break;
            }
            iO = o(length, charSequence, str, z5);
        } while (iO != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }
}
