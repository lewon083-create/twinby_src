package fh;

import android.net.Uri;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class qu implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sy f18202b;

    public /* synthetic */ qu(sy syVar, int i) {
        this.f18201a = i;
        this.f18202b = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public final Object resolve(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
        int i = this.f18201a;
        sy syVar = this.f18202b;
        switch (i) {
            case 0:
                fv fvVar = (fv) entityTemplate;
                JSONObject jSONObject = (JSONObject) obj;
                Field field = fvVar.f17234a;
                ij.p pVar = syVar.f18522s1;
                ij.p pVar2 = syVar.f18503q1;
                JsonFieldResolver.resolveOptionalExpression(parsingContext, fvVar.f17236c, jSONObject, "background_accessibility_description", TypeHelpersKt.TYPE_HELPER_STRING);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, fvVar.f17237d, jSONObject, "close_by_tap_outside", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN, ru.f18262a);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, fvVar.f17239f, jSONObject, "duration", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, ru.f18265d, ru.f18263b);
                JsonFieldResolver.resolveExpression(parsingContext, fvVar.f17242j, jSONObject, "position", ru.f18264c, kr.H);
                JsonFieldResolver.resolveOptionalList(parsingContext, fvVar.f17243k, jSONObject, "tap_outside_actions", syVar.f18464m1, syVar.f18443k1);
                return new ou();
            case 1:
                iv ivVar = (iv) entityTemplate;
                JSONObject jSONObject2 = (JSONObject) obj;
                Field field2 = ivVar.f17449a;
                ij.p pVar3 = syVar.Q5;
                ij.p pVar4 = syVar.O5;
                if (((wk) JsonFieldResolver.resolveOptional(parsingContext, field2, jSONObject2, "pivot_x", pVar3, pVar4)) == null) {
                    int i10 = hv.f17374a;
                }
                if (((wk) JsonFieldResolver.resolveOptional(parsingContext, ivVar.f17450b, jSONObject2, "pivot_y", syVar.Q5, pVar4)) == null) {
                    int i11 = hv.f17374a;
                }
                JsonFieldResolver.resolveOptionalExpression(parsingContext, ivVar.f17451c, jSONObject2, "rotation", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE);
                return new gv();
            case 2:
                pv pvVar = (pv) entityTemplate;
                JSONObject jSONObject3 = (JSONObject) obj;
                JsonFieldResolver.resolveList(parsingContext, pvVar.f18135a, jSONObject3, "actions", syVar.f18464m1, syVar.f18443k1, ov.f18071c);
                JsonFieldResolver.resolveExpression(parsingContext, pvVar.f18136b, jSONObject3, "condition", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, pvVar.f18137c, jSONObject3, "mode", ov.f18070b, kv.f17647h, ov.f18069a);
                return new nv();
            case 3:
                vw vwVar = (vw) entityTemplate;
                JSONObject jSONObject4 = (JSONObject) obj;
                JsonFieldResolver.resolveOptionalExpression(parsingContext, vwVar.f18810a, jSONObject4, "bitrate", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT);
                JsonFieldResolver.resolveExpression(parsingContext, vwVar.f18811b, jSONObject4, "mime_type", TypeHelpersKt.TYPE_HELPER_STRING);
                JsonFieldResolver.resolveExpression(parsingContext, vwVar.f18813d, jSONObject4, "url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
                return new zf();
            default:
                bx bxVar = (bx) entityTemplate;
                JSONObject jSONObject5 = (JSONObject) obj;
                Field field3 = bxVar.f16984b;
                TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
                Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
                Expression expression = ax.f16878a;
                Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject5, "is_enabled", typeHelper, function1, expression);
                Expression expression2 = expressionResolveOptionalExpression == null ? expression : expressionResolveOptionalExpression;
                Expression expressionResolveExpression = JsonFieldResolver.resolveExpression(parsingContext, bxVar.f16985c, jSONObject5, "log_id", TypeHelpersKt.TYPE_HELPER_STRING);
                Field field4 = bxVar.f16986d;
                TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
                Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
                xs xsVar = ax.f16882e;
                Expression expression3 = ax.f16879b;
                Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject5, "log_limit", typeHelper2, function12, xsVar, expression3);
                Expression expression4 = expressionResolveOptionalExpression2 == null ? expression3 : expressionResolveOptionalExpression2;
                JSONObject jSONObject6 = (JSONObject) JsonFieldResolver.resolveOptional(parsingContext, bxVar.f16987e, jSONObject5, "payload");
                Field field5 = bxVar.f16988f;
                TypeHelper<Uri> typeHelper3 = TypeHelpersKt.TYPE_HELPER_URI;
                Function1<Object, Uri> function13 = ParsingConvertersKt.ANY_TO_URI;
                Expression expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject5, "referer", typeHelper3, function13);
                Expression expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, bxVar.i, jSONObject5, "url", typeHelper3, function13);
                Field field6 = bxVar.f16991j;
                xs xsVar2 = ax.f16883f;
                Expression expression5 = ax.f16880c;
                Expression expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject5, "visibility_duration", typeHelper2, function12, xsVar2, expression5);
                Expression expression6 = expressionResolveOptionalExpression5 == null ? expression5 : expressionResolveOptionalExpression5;
                Field field7 = bxVar.f16992k;
                xs xsVar3 = ax.f16884g;
                Expression expression7 = ax.f16881d;
                Expression expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject5, "visibility_percentage", typeHelper2, function12, xsVar3, expression7);
                return new yw(expression2, expressionResolveExpression, expression4, expressionResolveOptionalExpression3, expressionResolveOptionalExpression4, expression6, expressionResolveOptionalExpression6 == null ? expression7 : expressionResolveOptionalExpression6, jSONObject6);
        }
    }
}
