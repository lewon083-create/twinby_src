package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.AbstractList;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Future;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ix {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Boolean f6634a;

    public static void A(String str, boolean z5) {
        if (!z5) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void B(boolean z5) {
        if (!z5) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    public static boolean C(File file, byte[] bArr) throws Throwable {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(file);
        } catch (IOException unused) {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            if (Build.VERSION.SDK_INT >= 34) {
                file.setReadOnly();
            }
            fileOutputStream.write(bArr);
            fileOutputStream.flush();
            ua.b.d(fileOutputStream);
            return true;
        } catch (IOException unused2) {
            fileOutputStream2 = fileOutputStream;
            ua.b.d(fileOutputStream2);
            return false;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream2 = fileOutputStream;
            ua.b.d(fileOutputStream2);
            throw th;
        }
    }

    public static boolean D(JSONArray jSONArray, String str) {
        if (jSONArray != null && str != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                String strOptString = jSONArray.optString(i);
                try {
                } catch (PatternSyntaxException e3) {
                    p9.k.C.f31302h.d("RtbAdapterMap.hasAtleastOneRegexMatch", e3);
                }
                if ((((Boolean) q9.s.f31967e.f31970c.a(al.gc)).booleanValue() ? Pattern.compile(strOptString, 2) : Pattern.compile(strOptString)).matcher(str).lookingAt()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean E(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }

    public static final byte[] F(int i, byte[] bArr, byte[] bArr2) {
        if (bArr.length - 16 < i) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[16];
        for (int i10 = 0; i10 < 16; i10++) {
            bArr3[i10] = (byte) (bArr[i10 + i] ^ bArr2[i10]);
        }
        return bArr3;
    }

    public static int G(SQLiteDatabase sQLiteDatabase, int i) {
        int i10 = 0;
        if (i == 2) {
            return 0;
        }
        Cursor cursorF0 = f0(sQLiteDatabase, i);
        if (cursorF0.getCount() > 0) {
            cursorF0.moveToNext();
            i10 = cursorF0.getInt(cursorF0.getColumnIndexOrThrow("value"));
        }
        cursorF0.close();
        return i10;
    }

    public static File H(File file, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file2 = new File(file, str);
        S(file2, false);
        return file2;
    }

    public static String I(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static AbstractList J(List list, c31 c31Var) {
        return list != null ? new ad.t0(list, c31Var) : new ad.u0(list, c31Var);
    }

    public static LinkedHashMap K(int i) {
        return new LinkedHashMap(i < 3 ? i + 1 : i < 1073741824 ? (int) ((i / 0.75f) + 1.0f) : Integer.MAX_VALUE);
    }

    public static void L(int i, int i10, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i10;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i10;
        } else {
            ((int[]) obj)[i] = i10;
        }
    }

    public static void M(Bundle bundle, String str, int i, boolean z5) {
        if (z5) {
            bundle.putInt(str, i);
        }
    }

    public static void N(File file, File file2) throws Throwable {
        file.getClass();
        file2.getClass();
        if (file.equals(file2)) {
            throw new IllegalArgumentException(gr.P("Source %s and destination %s must be different", file, file2));
        }
        if (file.renameTo(file2)) {
            return;
        }
        if (file.equals(file2)) {
            throw new IllegalArgumentException(gr.P("Source %s and destination %s must be different", file, file2));
        }
        d51 d51VarT = d51.t(new n61[0]);
        m61 m61Var = new m61();
        ArrayDeque arrayDeque = m61Var.f7792b;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            arrayDeque.addFirst(fileInputStream);
            FileOutputStream fileOutputStream = new FileOutputStream(file2, d51VarT.contains(n61.f8207b));
            arrayDeque.addFirst(fileOutputStream);
            int i = k61.f7127a;
            byte[] bArr = new byte[8192];
            while (true) {
                int i10 = fileInputStream.read(bArr);
                if (i10 == -1) {
                    break;
                } else {
                    fileOutputStream.write(bArr, 0, i10);
                }
            }
            m61Var.close();
            if (file.delete()) {
                return;
            }
            if (!file2.delete()) {
                throw new IOException("Unable to delete ".concat(file2.toString()));
            }
            throw new IOException("Unable to delete ".concat(file.toString()));
        } catch (Throwable th2) {
            try {
                m61Var.f7793c = th2;
                Object obj = r31.f9693a;
                if (IOException.class.isInstance(th2)) {
                    throw ((Throwable) IOException.class.cast(th2));
                }
                if (th2 instanceof RuntimeException) {
                    throw ((RuntimeException) th2);
                }
                if (!(th2 instanceof Error)) {
                    throw new RuntimeException(th2);
                }
                throw ((Error) th2);
            } catch (Throwable th3) {
                m61Var.close();
                throw th3;
            }
        }
    }

    public static final void O(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        if (i < 0 || byteBuffer2.remaining() < i || byteBuffer3.remaining() < i || byteBuffer.remaining() < i) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i10 = 0; i10 < i; i10++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static void Q(int i, String str, boolean z5) {
        if (!z5) {
            throw new IllegalArgumentException(gr.P(str, Integer.valueOf(i)));
        }
    }

    public static void R(Bundle bundle, String str, boolean z5, boolean z10) {
        if (z10) {
            bundle.putBoolean(str, z5);
        }
    }

    public static void S(File file, boolean z5) {
        if (z5 && file.exists() && !file.isDirectory()) {
            file.delete();
        }
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    public static void T(byte[] bArr, int i, long j10) {
        for (int i10 = 0; i10 < 4; i10++) {
            bArr[i + i10] = (byte) (255 & j10);
            j10 >>= 8;
        }
    }

    public static boolean U(char c8) {
        return c8 >= 'A' && c8 <= 'Z';
    }

    public static int W(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i10;
        int i11;
        int iT = vv.t(obj);
        int i12 = iT & i;
        int iT2 = t(i12, obj3);
        if (iT2 != 0) {
            int i13 = ~i;
            int i14 = iT & i13;
            int i15 = -1;
            while (true) {
                i10 = iT2 - 1;
                int i16 = iArr[i10];
                i11 = i16 & i;
                if ((i16 & i13) != i14 || !Objects.equals(obj, objArr[i10]) || (objArr2 != null && !Objects.equals(obj2, objArr2[i10]))) {
                    if (i11 == 0) {
                        break;
                    }
                    i15 = i10;
                    iT2 = i11;
                } else {
                    break;
                }
            }
            if (i15 == -1) {
                L(i12, i11, obj3);
                return i10;
            }
            iArr[i15] = (iArr[i15] & i13) | (i11 & i);
            return i10;
        }
        return -1;
    }

    public static void Y(SQLiteDatabase sQLiteDatabase, long j10, byte[] bArr) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(j10));
        contentValues.put("serialized_proto_data", bArr);
        if (sQLiteDatabase.update("offline_signal_contents", contentValues, "timestamp = ?", new String[]{String.valueOf(j10)}) == 0) {
            sQLiteDatabase.insert("offline_signal_contents", null, contentValues);
        }
    }

    public static void Z(String str, long j10, boolean z5) {
        if (!z5) {
            throw new IllegalArgumentException(gr.P(str, Long.valueOf(j10)));
        }
    }

    public static Bundle a(Bundle bundle, String str) {
        Bundle bundle2 = bundle.getBundle(str);
        return bundle2 == null ? new Bundle() : bundle2;
    }

    public static void a0(String str, String str2, Bundle bundle) {
        if (str2 != null) {
            bundle.putString(str, str2);
        }
    }

    public static File b(String str, String str2, File file) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return new File(H(file, str), str2);
    }

    public static boolean b0(File file) {
        boolean z5;
        if (!file.exists()) {
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            z5 = true;
            for (int i = 0; i < fileArrListFiles.length; i++) {
                File file2 = fileArrListFiles[i];
                z5 = file2 != null && b0(file2) && z5;
            }
        } else {
            z5 = true;
        }
        return file.delete() && z5;
    }

    public static Object c(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            throw new IllegalArgumentException(l7.o.j(i, "must be power of 2 between 2^1 and 2^30: ", new StringBuilder(String.valueOf(i).length() + 41)));
        }
        return i <= 256 ? new byte[i] : i <= 65536 ? new short[i] : new int[i];
    }

    public static boolean c0(CharSequence charSequence, String str) {
        char c8;
        int length = str.length();
        if (str == charSequence) {
            return true;
        }
        if (length == charSequence.length()) {
            for (int i = 0; i < length; i++) {
                if (str.charAt(i) == charSequence.charAt(i) || ((c8 = (char) ((r3 | ' ') - 97)) < 26 && c8 == ((char) ((r4 | ' ') - 97)))) {
                }
            }
            return true;
        }
        return false;
    }

    public static Object d(Future future) {
        Object obj;
        boolean z5 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z5 = true;
            } catch (Throwable th2) {
                if (z5) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z5) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static /* synthetic */ String e(int i) {
        switch (i) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            default:
                return "END_DOCUMENT";
        }
    }

    public static void e0(boolean z5, String str, Object obj) {
        if (!z5) {
            throw new IllegalArgumentException(gr.P(str, obj));
        }
    }

    public static String f(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        int visibility = view.getVisibility();
        if (visibility == 8) {
            return "viewGone";
        }
        if (visibility == 4) {
            return "viewInvisible";
        }
        if (visibility != 0) {
            return "viewNotVisible";
        }
        if (view.getAlpha() == 0.0f) {
            return "viewAlphaZero";
        }
        return null;
    }

    public static Cursor f0(SQLiteDatabase sQLiteDatabase, int i) {
        String[] strArr = {"value"};
        String[] strArr2 = new String[1];
        if (i == 0) {
            strArr2[0] = "failed_requests";
        } else if (i == 1) {
            strArr2[0] = "total_requests";
        } else if (i != 2) {
            strArr2[0] = "completed_requests";
        } else {
            strArr2[0] = "last_successful_request_time";
        }
        return sQLiteDatabase.query("offline_signal_statistics", strArr, "statistic_name = ?", strArr2, null, null, null);
    }

    public static String g(bn1 bn1Var) {
        StringBuilder sb2 = new StringBuilder(bn1Var.n());
        for (int i = 0; i < bn1Var.n(); i++) {
            byte bF = bn1Var.f(i);
            if (bF == 34) {
                sb2.append("\\\"");
            } else if (bF == 39) {
                sb2.append("\\'");
            } else if (bF != 92) {
                switch (bF) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (bF < 32 || bF > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((bF >>> 6) & 3) + 48));
                            sb2.append((char) (((bF >>> 3) & 7) + 48));
                            sb2.append((char) ((bF & 7) + 48));
                        } else {
                            sb2.append((char) bF);
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    public static void g0(Bundle bundle, String str, List list) {
        if (list != null) {
            bundle.putStringArrayList(str, new ArrayList<>(list));
        }
    }

    public static String h(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (U(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c8 = charArray[i];
                    if (U(c8)) {
                        charArray[i] = (char) (c8 ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static String i(JSONObject jSONObject, String str, String str2) {
        JSONArray jSONArrayOptJSONArray;
        if (jSONObject != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray(str2)) != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("including");
                    JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject.optJSONArray("excluding");
                    if (D(jSONArrayOptJSONArray2, str) && !D(jSONArrayOptJSONArray3, str)) {
                        return jSONObjectOptJSONObject.optString("effective_ad_unit_id", "");
                    }
                }
            }
        }
        return "";
    }

    public static void i0(SQLiteDatabase sQLiteDatabase, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("value", (Integer) 0);
        sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = ?", new String[]{str});
    }

    public static ArrayList j(d61 d61Var) {
        ArrayList arrayList = new ArrayList();
        d61Var.getClass();
        while (d61Var.hasNext()) {
            arrayList.add(d61Var.next());
        }
        return arrayList;
    }

    public static void j0(SQLiteDatabase sQLiteDatabase, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("statistic_name", str);
        contentValues.put("value", (Integer) 0);
        sQLiteDatabase.insert("offline_signal_statistics", null, contentValues);
    }

    public static void k(long j10, String str) {
        if (j10 >= 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 17);
        sb2.append(str);
        sb2.append(" (");
        sb2.append(j10);
        sb2.append(") must be >= 0");
        throw new IllegalArgumentException(sb2.toString());
    }

    public static void k0(boolean z5) {
        if (!z5) {
            throw new IllegalStateException();
        }
    }

    public static void l0(String str, boolean z5) {
        if (!z5) {
            throw new IllegalStateException(str);
        }
    }

    public static void m(ed.d dVar, String str) {
        h91 h91Var = new h91(str, 4);
        dVar.a(new l81(0, dVar, h91Var), hx.f6285g);
    }

    public static void m0(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void n(File file, byte[] bArr) throws IOException {
        file.getClass();
        d51 d51VarT = d51.t(new n61[0]);
        bArr.getClass();
        FileOutputStream fileOutputStream = new FileOutputStream(file, d51VarT.contains(n61.f8207b));
        try {
            fileOutputStream.write(bArr);
            fileOutputStream.close();
        } catch (Throwable th2) {
            try {
                fileOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static void n0(int i, int i10) {
        String strP;
        if (i < 0 || i >= i10) {
            if (i < 0) {
                strP = gr.P("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i10 < 0) {
                    throw new IllegalArgumentException(l7.o.j(i10, "negative size: ", new StringBuilder(String.valueOf(i10).length() + 15)));
                }
                strP = gr.P("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(strP);
        }
    }

    public static void o(boolean z5) {
        if (!z5) {
            throw new IllegalArgumentException();
        }
    }

    public static void o0(int i, int i10) {
        if (i < 0 || i > i10) {
            throw new IndexOutOfBoundsException(q0(i, i10, "index"));
        }
    }

    public static void p(long[] jArr, long[] jArr2, int i) {
        for (int i10 = 0; i10 < 10; i10++) {
            int i11 = (int) jArr[i10];
            jArr[i10] = ((-i) & (((int) jArr2[i10]) ^ i11)) ^ i11;
        }
    }

    public static void p0(int i, int i10, int i11) {
        if (i < 0 || i10 < i || i10 > i11) {
            throw new IndexOutOfBoundsException((i < 0 || i > i11) ? q0(i, i11, "start index") : (i10 < 0 || i10 > i11) ? q0(i10, i11, "end index") : gr.P("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i)));
        }
    }

    public static boolean q(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static String q0(int i, int i10, String str) {
        if (i < 0) {
            return gr.P("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i10 >= 0) {
            return gr.P("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i10));
        }
        throw new IllegalArgumentException(l7.o.j(i10, "negative size: ", new StringBuilder(String.valueOf(i10).length() + 15)));
    }

    public static byte[] r(byte[] bArr, byte[] bArr2) {
        long jU = u(0, bArr) & 67108863;
        int i = 3;
        long jU2 = (u(3, bArr) >> 2) & 67108611;
        long jU3 = (u(6, bArr) >> 4) & 67092735;
        long jU4 = (u(9, bArr) >> 6) & 66076671;
        long jU5 = (u(12, bArr) >> 8) & 1048575;
        byte[] bArr3 = new byte[17];
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        int i10 = 0;
        while (true) {
            int length = bArr2.length;
            if (i10 >= length) {
                long j15 = j10 + (j11 >> 26);
                long j16 = j15 & 67108863;
                long j17 = j12 + (j15 >> 26);
                long j18 = j17 & 67108863;
                long j19 = j13 + (j17 >> 26);
                long j20 = j19 & 67108863;
                long j21 = ((j19 >> 26) * 5) + j14;
                long j22 = j21 >> 26;
                long j23 = j21 & 67108863;
                long j24 = j23 + 5;
                long j25 = (j11 & 67108863) + j22;
                long j26 = j25 + (j24 >> 26);
                long j27 = j16 + (j26 >> 26);
                long j28 = j18 + (j27 >> 26);
                long j29 = (j20 + (j28 >> 26)) - 67108864;
                long j30 = j29 >> 63;
                long j31 = ~j30;
                long j32 = (j25 & j30) | (j26 & 67108863 & j31);
                long j33 = (j16 & j30) | (j27 & 67108863 & j31);
                long j34 = (j18 & j30) | (j28 & 67108863 & j31);
                long jU6 = u(16, bArr) + (((j24 & 67108863 & j31) | (j23 & j30) | (j32 << 26)) & 4294967295L);
                long jU7 = u(20, bArr);
                long jU8 = u(24, bArr);
                long jU9 = u(28, bArr) + (((j34 >> 18) | (((j20 & j30) | (j29 & j31)) << 8)) & 4294967295L);
                byte[] bArr4 = new byte[16];
                T(bArr4, 0, jU6 & 4294967295L);
                long j35 = jU7 + (((j32 >> 6) | (j33 << 20)) & 4294967295L) + (jU6 >> 32);
                T(bArr4, 4, j35 & 4294967295L);
                long j36 = jU8 + (((j34 << 14) | (j33 >> 12)) & 4294967295L) + (j35 >> 32);
                T(bArr4, 8, j36 & 4294967295L);
                T(bArr4, 12, (jU9 + (j36 >> 32)) & 4294967295L);
                return bArr4;
            }
            int iMin = Math.min(16, length - i10);
            System.arraycopy(bArr2, i10, bArr3, 0, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr3, iMin + 1, 17, (byte) 0);
            }
            long j37 = jU5 * 5;
            long j38 = jU4 * 5;
            long j39 = jU3 * 5;
            long jU10 = j14 + (u(0, bArr3) & 67108863);
            long jU11 = j11 + ((u(i, bArr3) >> 2) & 67108863);
            long jU12 = j10 + ((u(6, bArr3) >> 4) & 67108863);
            long jU13 = j12 + ((u(9, bArr3) >> 6) & 67108863);
            long j40 = jU2;
            long jU14 = j13 + (((u(12, bArr3) >> 8) & 67108863) | ((long) (bArr3[16] << 24)));
            long j41 = jU11 * jU;
            long j42 = jU11 * j40;
            long j43 = jU12 * jU;
            long j44 = jU11 * jU3;
            long j45 = jU12 * j40;
            long j46 = jU13 * jU;
            long j47 = jU11 * jU4;
            long j48 = jU12 * jU3;
            long j49 = jU13 * j40;
            long j50 = jU14 * jU;
            long j51 = (jU2 * 5 * jU14) + (jU13 * j39) + (jU12 * j38) + (jU11 * j37) + (jU10 * jU);
            long j52 = j51 & 67108863;
            long j53 = jU13 * j38;
            long j54 = j39 * jU14;
            long j55 = j54 + j53 + (jU12 * j37) + (jU10 * j40) + j41 + (j51 >> 26);
            long j56 = j38 * jU14;
            long j57 = j56 + (jU13 * j37) + (jU10 * jU3) + j42 + j43 + (j55 >> 26);
            long j58 = (jU14 * j37) + (jU10 * jU4) + j44 + j45 + j46 + (j57 >> 26);
            long j59 = (jU10 * jU5) + j47 + j48 + j49 + j50 + (j58 >> 26);
            long j60 = ((j59 >> 26) * 5) + j52;
            j11 = (j55 & 67108863) + (j60 >> 26);
            i10 += 16;
            j10 = j57 & 67108863;
            j12 = j58 & 67108863;
            j13 = j59 & 67108863;
            j14 = j60 & 67108863;
            jU2 = j40;
            i = 3;
        }
    }

    public static byte[] s(byte[]... bArr) throws GeneralSecurityException {
        int i = 0;
        int i10 = 0;
        while (true) {
            if (i >= bArr.length) {
                byte[] bArr2 = new byte[i10];
                int i11 = 0;
                for (byte[] bArr3 : bArr) {
                    int length = bArr3.length;
                    System.arraycopy(bArr3, 0, bArr2, i11, length);
                    i11 += length;
                }
                return bArr2;
            }
            int length2 = bArr[i].length;
            if (i10 > Integer.MAX_VALUE - length2) {
                throw new GeneralSecurityException("exceeded size limit");
            }
            i10 += length2;
            i++;
        }
    }

    public static int t(int i, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i] & 255 : obj instanceof short[] ? (char) ((short[]) obj)[i] : ((int[]) obj)[i];
    }

    public static long u(int i, byte[] bArr) {
        int i10 = bArr[i] & 255;
        int i11 = bArr[i + 1] & 255;
        int i12 = bArr[i + 2] & 255;
        return ((long) (((bArr[i + 3] & 255) << 24) | (i11 << 8) | i10 | (i12 << 16))) & 4294967295L;
    }

    public static String v(ll1 ll1Var) throws GeneralSecurityException {
        int iOrdinal = ll1Var.ordinal();
        if (iOrdinal == 0) {
            return "SHA-1";
        }
        if (iOrdinal == 1) {
            return "SHA-224";
        }
        if (iOrdinal == 2) {
            return "SHA-256";
        }
        if (iOrdinal == 3) {
            return "SHA-384";
        }
        if (iOrdinal == 4) {
            return "SHA-512";
        }
        throw new GeneralSecurityException("Unsupported hash ".concat(ll1Var.toString()));
    }

    public static String w(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c8 = charArray[i];
                    if (c8 >= 'a' && c8 <= 'z') {
                        charArray[i] = (char) (c8 ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static void x(Bundle bundle, String str, String str2, boolean z5) {
        if (!z5 || str2 == null) {
            return;
        }
        bundle.putString(str, str2);
    }

    public static void z(File file) throws IOException {
        file.getClass();
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (!parentFile.isDirectory()) {
            throw new IOException("Unable to create parent directories of ".concat(file.toString()));
        }
    }

    public abstract boolean P(p71 p71Var, o71 o71Var, o71 o71Var2);

    public abstract boolean V(h71 h71Var, e71 e71Var, e71 e71Var2);

    public abstract o71 X(h71 h71Var);

    public abstract e71 d0(h71 h71Var);

    public abstract boolean h0(p71 p71Var, Object obj, Object obj2);

    public abstract void l(o71 o71Var, Thread thread);

    public abstract void y(o71 o71Var, o71 o71Var2);
}
