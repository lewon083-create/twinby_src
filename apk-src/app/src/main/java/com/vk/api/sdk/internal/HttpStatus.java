package com.vk.api.sdk.internal;

import android.util.SparseArray;
import com.vk.api.sdk.exceptions.VKApiCodes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

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
public final class HttpStatus {
    public static final HttpStatus INSTANCE = new HttpStatus();
    private static final SparseArray<String> sMap;

    static {
        SparseArray<String> sparseArray = new SparseArray<>();
        sparseArray.put(100, "Continue");
        sparseArray.put(101, "Switching Protocols");
        sparseArray.put(102, "Processing");
        sparseArray.put(103, "Checkpoint");
        sparseArray.put(VKApiCodes.CODE_ACCESS_DENIED_TO_ALBUM, "OK");
        sparseArray.put(VKApiCodes.CODE_ACCESS_DENIED_TO_AUDIO, "Created");
        sparseArray.put(202, "Accepted");
        sparseArray.put(VKApiCodes.CODE_ACCESS_DENIED_TO_GROUP, "Non-Authoritative Information");
        sparseArray.put(204, "No Content");
        sparseArray.put(205, "Reset Content");
        sparseArray.put(206, "Partial Content");
        sparseArray.put(207, "Multi-Status");
        sparseArray.put(208, "Already Reported");
        sparseArray.put(226, "IM Used");
        sparseArray.put(VKApiCodes.CODE_PHOTO_ALBUM_LIMIT_EXCEED, "Multiple Choices");
        sparseArray.put(301, "Moved Permanently");
        sparseArray.put(302, "Found");
        sparseArray.put(303, "See Other");
        sparseArray.put(304, "Not Modified");
        sparseArray.put(305, "Use Proxy");
        sparseArray.put(307, "Temporary Redirect");
        sparseArray.put(308, "Permanent Redirect");
        sparseArray.put(400, "Bad Request");
        sparseArray.put(401, "Unauthorized");
        sparseArray.put(402, "Payment Required");
        sparseArray.put(403, "Forbidden");
        sparseArray.put(404, "Not Found");
        sparseArray.put(405, "Method Not Allowed");
        sparseArray.put(406, "Not Acceptable");
        sparseArray.put(407, "Proxy Authentication Required");
        sparseArray.put(408, "Request Timeout");
        sparseArray.put(409, "Conflict");
        sparseArray.put(410, "Gone");
        sparseArray.put(411, "Length Required");
        sparseArray.put(412, "Precondition Failed");
        sparseArray.put(413, "Payload Too Large");
        sparseArray.put(414, "URI Too Long");
        sparseArray.put(415, "Unsupported Media Type");
        sparseArray.put(416, "Requested range not satisfiable");
        sparseArray.put(417, "Expectation Failed");
        sparseArray.put(418, "I'm a teapot");
        sparseArray.put(419, "Insufficient Space On Resource");
        sparseArray.put(420, "Method Failure");
        sparseArray.put(421, "Destination Locked");
        sparseArray.put(422, "Unprocessable Entity");
        sparseArray.put(423, "Locked");
        sparseArray.put(424, "Failed Dependency");
        sparseArray.put(426, "Upgrade Required");
        sparseArray.put(428, "Precondition Required");
        sparseArray.put(429, "Too Many Requests");
        sparseArray.put(431, "Request Header Fields Too Large");
        sparseArray.put(500, "Internal Server Error");
        sparseArray.put(501, "Not Implemented");
        sparseArray.put(502, "Bad Gateway");
        sparseArray.put(503, "Service Unavailable");
        sparseArray.put(VKApiCodes.CODE_VK_PAY_NOT_ENOUGH_MONEY, "Gateway Timeout");
        sparseArray.put(505, "HTTP Version not supported");
        sparseArray.put(VKApiCodes.CODE_VK_PAY_INVALID_AMOUNT, "Variant Also Negotiates");
        sparseArray.put(507, "Insufficient Storage");
        sparseArray.put(508, "Loop Detected");
        sparseArray.put(VKApiCodes.CODE_VK_PAY_INVALID_PIN, "Bandwidth Limit Exceeded");
        sparseArray.put(510, "Not Extended");
        sparseArray.put(511, "Network Authentication Required");
        sMap = sparseArray;
    }

    private HttpStatus() {
    }

    public final String getDescription(int i) {
        String str = sMap.get(i);
        Intrinsics.checkNotNullExpressionValue(str, "sMap.get(status)");
        return str;
    }
}
