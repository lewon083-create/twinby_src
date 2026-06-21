package com.yandex.div.internal.util;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class JsonPrinter {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private final int indentSpaces;
    private final int nestingLimit;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public JsonPrinter(int i, int i10) {
        this.indentSpaces = i;
        this.nestingLimit = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final org.json.JSONObject deepCopy(org.json.JSONObject r7, int r8) throws org.json.JSONException {
        /*
            r6 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.util.Iterator r1 = r7.keys()
        L9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r7.opt(r2)
            boolean r4 = r3 instanceof org.json.JSONObject
            java.lang.String r5 = "..."
            if (r4 == 0) goto L2c
            if (r8 != 0) goto L23
        L21:
            r3 = r5
            goto L3b
        L23:
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            int r4 = r8 + (-1)
            org.json.JSONObject r3 = r6.deepCopy(r3, r4)
            goto L3b
        L2c:
            boolean r4 = r3 instanceof org.json.JSONArray
            if (r4 == 0) goto L3b
            if (r8 != 0) goto L33
            goto L21
        L33:
            org.json.JSONArray r3 = (org.json.JSONArray) r3
            int r4 = r8 + (-1)
            org.json.JSONArray r3 = r6.deepCopy(r3, r4)
        L3b:
            r0.put(r2, r3)
            goto L9
        L3f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.internal.util.JsonPrinter.deepCopy(org.json.JSONObject, int):org.json.JSONObject");
    }

    @NotNull
    public final String print(@NotNull JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectDeepCopy = deepCopy(jSONObject, this.nestingLimit);
        int i = this.indentSpaces;
        return i == 0 ? jSONObjectDeepCopy.toString() : jSONObjectDeepCopy.toString(i);
    }

    @NotNull
    public final String print(@NotNull JSONArray jSONArray) {
        JSONArray jSONArrayDeepCopy = deepCopy(jSONArray, this.nestingLimit);
        int i = this.indentSpaces;
        return i == 0 ? jSONArrayDeepCopy.toString() : jSONArrayDeepCopy.toString(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final org.json.JSONArray deepCopy(org.json.JSONArray r7, int r8) {
        /*
            r6 = this;
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            int r1 = r7.length()
            r2 = 0
        La:
            if (r2 >= r1) goto L38
            java.lang.Object r3 = r7.opt(r2)
            boolean r4 = r3 instanceof org.json.JSONObject
            java.lang.String r5 = "..."
            if (r4 == 0) goto L23
            if (r8 != 0) goto L1a
        L18:
            r3 = r5
            goto L32
        L1a:
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            int r4 = r8 + (-1)
            org.json.JSONObject r3 = r6.deepCopy(r3, r4)
            goto L32
        L23:
            boolean r4 = r3 instanceof org.json.JSONArray
            if (r4 == 0) goto L32
            if (r8 != 0) goto L2a
            goto L18
        L2a:
            org.json.JSONArray r3 = (org.json.JSONArray) r3
            int r4 = r8 + (-1)
            org.json.JSONArray r3 = r6.deepCopy(r3, r4)
        L32:
            r0.put(r3)
            int r2 = r2 + 1
            goto La
        L38:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.internal.util.JsonPrinter.deepCopy(org.json.JSONArray, int):org.json.JSONArray");
    }
}
