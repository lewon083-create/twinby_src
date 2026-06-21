package io.sentry.flutter;

import io.sentry.Breadcrumb;
import io.sentry.android.replay.DefaultReplayBreadcrumbConverter;
import io.sentry.protocol.Request;
import io.sentry.protocol.Response;
import io.sentry.rrweb.RRWebBreadcrumbEvent;
import io.sentry.rrweb.RRWebEvent;
import io.sentry.rrweb.RRWebSpanEvent;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.i0;
import kotlin.collections.j0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

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
public final class SentryFlutterReplayBreadcrumbConverter extends DefaultReplayBreadcrumbConverter {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final Map<String, String> supportedNetworkData = j0.g(new Pair(Response.JsonKeys.STATUS_CODE, "statusCode"), new Pair(Request.JsonKeys.METHOD, Request.JsonKeys.METHOD), new Pair("response_body_size", "responseBodySize"), new Pair("request_body_size", "requestBodySize"));

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final RRWebEvent convertNetworkBreadcrumb(Breadcrumb breadcrumb) {
        RRWebEvent rRWebEventConvert = super.convert(breadcrumb);
        RRWebEvent rRWebEvent = rRWebEventConvert;
        if (rRWebEventConvert == null) {
            rRWebEvent = rRWebEventConvert;
            if (breadcrumb.getData().containsKey("start_timestamp")) {
                rRWebEvent = rRWebEventConvert;
                if (breadcrumb.getData().containsKey("end_timestamp")) {
                    RRWebSpanEvent rRWebSpanEvent = new RRWebSpanEvent();
                    rRWebSpanEvent.setOp("resource.http");
                    rRWebSpanEvent.setTimestamp(breadcrumb.getTimestamp().getTime());
                    Object obj = breadcrumb.getData().get("url");
                    Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.String");
                    rRWebSpanEvent.setDescription((String) obj);
                    Object obj2 = breadcrumb.getData().get("start_timestamp");
                    Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                    rRWebSpanEvent.setStartTimestamp(doubleTimestamp(((Long) obj2).longValue()));
                    Object obj3 = breadcrumb.getData().get("end_timestamp");
                    Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                    rRWebSpanEvent.setEndTimestamp(doubleTimestamp(((Long) obj3).longValue()));
                    Map<String, Object> data = breadcrumb.getData();
                    Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<String, Object> entry : data.entrySet()) {
                        if (supportedNetworkData.containsKey(entry.getKey())) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(i0.b(linkedHashMap.size()));
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        linkedHashMap2.put(supportedNetworkData.get((String) entry2.getKey()), entry2.getValue());
                    }
                    rRWebSpanEvent.setData(linkedHashMap2);
                    rRWebEvent = rRWebSpanEvent;
                }
            }
        }
        return rRWebEvent;
    }

    private final double doubleTimestamp(long j10) {
        return j10 / 1000.0d;
    }

    private final String getTouchPathMessage(Object obj) {
        if (!(obj instanceof List)) {
            return null;
        }
        List list = (List) obj;
        if (list.isEmpty()) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        int iMin = Math.min(4, list.size());
        while (true) {
            iMin--;
            if (-1 >= iMin) {
                return sb2.toString();
            }
            Object obj2 = list.get(iMin);
            if (obj2 instanceof Map) {
                Map map = (Map) obj2;
                Object obj3 = map.get("element");
                if (obj3 == null) {
                    obj3 = "?";
                }
                sb2.append(obj3);
                Object string = map.get("label");
                if (string == null) {
                    string = map.get("name");
                }
                if ((string instanceof String) && ((CharSequence) string).length() > 0) {
                    String str = (String) string;
                    if (str.length() > 20) {
                        StringBuilder sb3 = new StringBuilder();
                        String strSubstring = str.substring(0, 17);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                        sb3.append(strSubstring);
                        sb3.append("...");
                        string = sb3.toString();
                    }
                    sb2.append("(");
                    sb2.append((String) string);
                    sb2.append(")");
                }
                if (iMin > 0) {
                    sb2.append(" > ");
                }
            }
        }
    }

    private final RRWebBreadcrumbEvent newRRWebBreadcrumb(Breadcrumb breadcrumb) {
        RRWebBreadcrumbEvent rRWebBreadcrumbEvent = new RRWebBreadcrumbEvent();
        rRWebBreadcrumbEvent.setCategory(breadcrumb.getCategory());
        rRWebBreadcrumbEvent.setLevel(breadcrumb.getLevel());
        rRWebBreadcrumbEvent.setData(breadcrumb.getData());
        rRWebBreadcrumbEvent.setTimestamp(breadcrumb.getTimestamp().getTime());
        Date timestamp = breadcrumb.getTimestamp();
        Intrinsics.checkNotNullExpressionValue(timestamp, "getTimestamp(...)");
        rRWebBreadcrumbEvent.setBreadcrumbTimestamp(doubleTimestamp(timestamp));
        rRWebBreadcrumbEvent.setBreadcrumbType("default");
        return rRWebBreadcrumbEvent;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // io.sentry.android.replay.DefaultReplayBreadcrumbConverter, io.sentry.ReplayBreadcrumbConverter
    @Nullable
    public RRWebEvent convert(@NotNull Breadcrumb breadcrumb) {
        Intrinsics.checkNotNullParameter(breadcrumb, "breadcrumb");
        String category = breadcrumb.getCategory();
        if (category == null) {
            return null;
        }
        switch (category.hashCode()) {
            case -2139323986:
                if (category.equals("ui.click")) {
                    RRWebBreadcrumbEvent rRWebBreadcrumbEventNewRRWebBreadcrumb = newRRWebBreadcrumb(breadcrumb);
                    rRWebBreadcrumbEventNewRRWebBreadcrumb.setCategory("ui.tap");
                    rRWebBreadcrumbEventNewRRWebBreadcrumb.setMessage(getTouchPathMessage(breadcrumb.getData().get("path")));
                    return rRWebBreadcrumbEventNewRRWebBreadcrumb;
                }
                break;
            case -252308533:
                if (category.equals("sentry.event")) {
                    return null;
                }
                break;
            case -152761521:
                if (category.equals("sentry.transaction")) {
                    return null;
                }
                break;
            case 3213448:
                if (category.equals("http")) {
                    return convertNetworkBreadcrumb(breadcrumb);
                }
                break;
            case 1862666772:
                if (category.equals("navigation")) {
                    if (breadcrumb.getData().containsKey("to") && (breadcrumb.getData().get("to") instanceof String)) {
                        return newRRWebBreadcrumb(breadcrumb);
                    }
                    return null;
                }
                break;
        }
        RRWebEvent rRWebEventConvert = super.convert(breadcrumb);
        if ((rRWebEventConvert instanceof RRWebBreadcrumbEvent) && Intrinsics.a(((RRWebBreadcrumbEvent) rRWebEventConvert).getCategory(), "navigation")) {
            return null;
        }
        return rRWebEventConvert;
    }

    private final double doubleTimestamp(Date date) {
        return doubleTimestamp(date.getTime());
    }
}
