package fh;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import io.appmetrica.analytics.impl.A2;
import io.sentry.protocol.ViewHierarchyNode;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ua implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f18676a;

    public ua(sy syVar) {
        this.f18676a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ra resolve(ParsingContext parsingContext, wa waVar, JSONObject jSONObject) {
        Field field = waVar.f18853a;
        sy syVar = this.f18676a;
        Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, waVar.f18854b, jSONObject, "alignment_horizontal", va.f18753e, v0.f18733v);
        Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, waVar.f18855c, jSONObject, "alignment_vertical", va.f18754f, v0.f18734w);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, waVar.f18856d, jSONObject, ViewHierarchyNode.JsonKeys.ALPHA, TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, va.f18756h, va.f18749a);
        JsonFieldResolver.resolveOptionalList(parsingContext, waVar.f18857e, jSONObject, "animators", syVar.v1, syVar.f18533t1);
        JsonFieldResolver.resolveOptionalList(parsingContext, waVar.f18858f, jSONObject, A2.f22054g, syVar.H1, syVar.F1);
        Field field2 = waVar.f18860h;
        TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
        Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
        JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "column_span", typeHelper, function1, va.i);
        List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, waVar.f18862k, jSONObject, "disappear_actions", syVar.Q2, syVar.O2);
        JsonFieldResolver.resolveOptionalList(parsingContext, waVar.f18863l, jSONObject, "extensions", syVar.f18358c3, syVar.f18335a3);
        JsonFieldResolver.resolveOptionalList(parsingContext, waVar.f18865n, jSONObject, "functions", syVar.J3, syVar.H3);
        lo loVar = (lo) JsonFieldResolver.resolveOptional(parsingContext, waVar.f18866o, jSONObject, "height", syVar.V6, syVar.T6);
        if (loVar == null) {
            loVar = va.f18750b;
        }
        lo loVar2 = loVar;
        JsonFieldResolver.resolveOptionalList(parsingContext, waVar.f18868q, jSONObject, "items", syVar.f18550u9, syVar.f18530s9);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, waVar.f18872u, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, waVar.f18873v, jSONObject, "row_span", typeHelper, function1, va.f18757j);
        JsonFieldResolver.resolveOptionalList(parsingContext, waVar.f18874w, jSONObject, "selected_actions", syVar.f18464m1, syVar.f18443k1);
        JsonFieldResolver.resolveOptionalList(parsingContext, waVar.f18875x, jSONObject, "tooltips", syVar.Q8, syVar.O8);
        JsonFieldResolver.resolveOptionalList(parsingContext, waVar.C, jSONObject, "transition_triggers", kv.f17646g, va.f18758k);
        JsonFieldResolver.resolveOptionalList(parsingContext, waVar.D, jSONObject, "variable_triggers", syVar.W8, syVar.U8);
        JsonFieldResolver.resolveOptionalList(parsingContext, waVar.E, jSONObject, "variables", syVar.c9, syVar.f18341a9);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, waVar.F, jSONObject, ViewHierarchyNode.JsonKeys.VISIBILITY, va.f18755g, kv.f17653o, va.f18751c);
        yw ywVar = (yw) JsonFieldResolver.resolveOptional(parsingContext, waVar.G, jSONObject, "visibility_action", syVar.f18490o9, syVar.m9);
        List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, waVar.H, jSONObject, "visibility_actions", syVar.f18490o9, syVar.m9);
        lo loVar3 = (lo) JsonFieldResolver.resolveOptional(parsingContext, waVar.I, jSONObject, "width", syVar.V6, syVar.T6);
        if (loVar3 == null) {
            loVar3 = va.f18752d;
        }
        return new ra(expressionResolveOptionalExpression, expressionResolveOptionalExpression2, listResolveOptionalList, loVar2, ywVar, listResolveOptionalList2, loVar3);
    }
}
