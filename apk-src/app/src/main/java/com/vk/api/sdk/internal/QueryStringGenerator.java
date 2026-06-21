package com.vk.api.sdk.internal;

import android.net.Uri;
import com.vk.api.sdk.exceptions.VKApiCodes;
import com.vk.api.sdk.utils.ThreadLocalDelegate;
import com.vk.api.sdk.utils.ThreadLocalDelegateKt;
import com.vk.api.sdk.utils.VKUtils;
import dk.i;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.j0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.z;
import kotlin.text.StringsKt;

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
public final class QueryStringGenerator {
    static final /* synthetic */ i[] $$delegatedProperties;
    public static final QueryStringGenerator INSTANCE;
    private static final ThreadLocalDelegate strBuilder$delegate;

    static {
        z zVar = new z(QueryStringGenerator.class, "strBuilder", "getStrBuilder()Ljava/lang/StringBuilder;", 0);
        g0.f27511a.getClass();
        $$delegatedProperties = new i[]{zVar};
        INSTANCE = new QueryStringGenerator();
        strBuilder$delegate = ThreadLocalDelegateKt.threadLocal(QueryStringGenerator$strBuilder$2.INSTANCE);
    }

    private QueryStringGenerator() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String buildNotSignedQueryString$default(QueryStringGenerator queryStringGenerator, Map map, String str, String str2, int i, Map map2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        String str3 = str2;
        if ((i10 & 8) != 0) {
            i = 0;
        }
        int i11 = i;
        if ((i10 & 16) != 0) {
            map2 = j0.d();
        }
        return queryStringGenerator.buildNotSignedQueryString(map, str, str3, i11, map2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String buildSignedQueryString$default(QueryStringGenerator queryStringGenerator, String str, Map map, String str2, String str3, String str4, int i, Map map2, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            str3 = null;
        }
        if ((i10 & 16) != 0) {
            str4 = null;
        }
        if ((i10 & 32) != 0) {
            i = 0;
        }
        if ((i10 & 64) != 0) {
            map2 = j0.d();
        }
        return queryStringGenerator.buildSignedQueryString(str, map, str2, str3, str4, i, map2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String buildSignedQueryStringForce$default(QueryStringGenerator queryStringGenerator, String str, Map map, String str2, Map map2, int i, Object obj) {
        if ((i & 8) != 0) {
            map2 = j0.d();
        }
        return queryStringGenerator.buildSignedQueryStringForce(str, map, str2, map2);
    }

    private final StringBuilder getStrBuilder() {
        return (StringBuilder) strBuilder$delegate.getValue(this, $$delegatedProperties[0]);
    }

    public final String buildNotSignedQueryString(Map<String, String> args, String version, String str, int i, Map<String, ? extends List<String>> arrayArgs) {
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(arrayArgs, "arrayArgs");
        return buildSignedQueryString("", args, version, str, null, i, arrayArgs);
    }

    public final String buildSignedQueryString(String path, Map<String, String> args, String version, String str, String str2, int i, Map<String, ? extends List<String>> arrayArgs) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(arrayArgs, "arrayArgs");
        LinkedHashMap linkedHashMapM = j0.m(args);
        linkedHashMapM.put("v", version);
        linkedHashMapM.put("https", "1");
        if (str != null && str.length() != 0) {
            linkedHashMapM.put(VKApiCodes.EXTRA_ACCESS_TOKEN, str);
        } else if (i != 0) {
            linkedHashMapM.put("api_id", String.valueOf(i));
        }
        return buildSignedQueryStringForce(path, linkedHashMapM, str2, arrayArgs);
    }

    public final String buildSignedQueryStringForMethod(String methodName, Map<String, String> methodArgs, String methodVersion, String str, String str2, int i) {
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(methodArgs, "methodArgs");
        Intrinsics.checkNotNullParameter(methodVersion, "methodVersion");
        return buildSignedQueryString$default(this, Intrinsics.f(methodName, "/method/"), methodArgs, methodVersion, str, str2, i, null, 64, null);
    }

    public final String buildSignedQueryStringForce(String path, Map<String, String> args, String str, Map<String, ? extends List<String>> arrayArgs) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(arrayArgs, "arrayArgs");
        Uri.Builder builder = new Uri.Builder();
        Iterator<T> it = args.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!Intrinsics.a(entry.getKey(), "sig")) {
                builder.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
        }
        Iterator<T> it2 = arrayArgs.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            String str2 = (String) entry2.getKey();
            Iterator it3 = ((List) entry2.getValue()).iterator();
            while (it3.hasNext()) {
                builder.appendQueryParameter(Intrinsics.f("[]", str2), (String) it3.next());
            }
        }
        Uri uriBuild = builder.build();
        if (str == null || str.length() == 0) {
            String encodedQuery = uriBuild.getEncodedQuery();
            return encodedQuery == null ? "" : encodedQuery;
        }
        String query = uriBuild.getQuery();
        getStrBuilder().setLength(0);
        StringBuilder strBuilder = getStrBuilder();
        strBuilder.append(path);
        strBuilder.append('?');
        if (query != null && !StringsKt.D(query)) {
            getStrBuilder().append(query);
        }
        getStrBuilder().append(str);
        String string = getStrBuilder().toString();
        Intrinsics.checkNotNullExpressionValue(string, "strBuilder.toString()");
        String encodedQuery2 = uriBuild.buildUpon().appendQueryParameter("sig", VKUtils.MD5.convert(string)).build().getEncodedQuery();
        return encodedQuery2 == null ? "" : encodedQuery2;
    }
}
