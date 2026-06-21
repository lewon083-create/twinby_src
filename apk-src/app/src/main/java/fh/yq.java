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
public final class yq implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f19184a;

    public yq(sy syVar) {
        this.f19184a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final vq resolve(ParsingContext parsingContext, ar arVar, JSONObject jSONObject) {
        Field field = arVar.f16850a;
        sy syVar = this.f19184a;
        Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, arVar.f16851b, jSONObject, "alignment_horizontal", zq.f19286f, v0.f18733v);
        Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, arVar.f16852c, jSONObject, "alignment_vertical", zq.f19287g, v0.f18734w);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, arVar.f16853d, jSONObject, ViewHierarchyNode.JsonKeys.ALPHA, TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, zq.i, zq.f19281a);
        JsonFieldResolver.resolveOptionalList(parsingContext, arVar.f16854e, jSONObject, "animators", syVar.v1, syVar.f18533t1);
        JsonFieldResolver.resolveOptionalList(parsingContext, arVar.f16855f, jSONObject, A2.f22054g, syVar.H1, syVar.F1);
        Field field2 = arVar.f16857h;
        TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
        Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
        JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "column_span", typeHelper, function1, zq.f19289j);
        List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, arVar.i, jSONObject, "disappear_actions", syVar.Q2, syVar.O2);
        JsonFieldResolver.resolveOptionalList(parsingContext, arVar.f16858j, jSONObject, "extensions", syVar.f18358c3, syVar.f18335a3);
        JsonFieldResolver.resolveOptionalList(parsingContext, arVar.f16860l, jSONObject, "functions", syVar.J3, syVar.H3);
        lo loVar = (lo) JsonFieldResolver.resolveOptional(parsingContext, arVar.f16861m, jSONObject, "height", syVar.V6, syVar.T6);
        if (loVar == null) {
            loVar = zq.f19282b;
        }
        lo loVar2 = loVar;
        JsonFieldResolver.resolveOptionalExpression(parsingContext, arVar.f16863o, jSONObject, "is_enabled", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN, zq.f19283c);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, arVar.f16867s, jSONObject, "on_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, arVar.f16869u, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, arVar.f16870v, jSONObject, "row_span", typeHelper, function1, zq.f19290k);
        JsonFieldResolver.resolveOptionalList(parsingContext, arVar.f16871w, jSONObject, "selected_actions", syVar.f18464m1, syVar.f18443k1);
        JsonFieldResolver.resolveOptionalList(parsingContext, arVar.f16872x, jSONObject, "tooltips", syVar.Q8, syVar.O8);
        JsonFieldResolver.resolveOptionalList(parsingContext, arVar.C, jSONObject, "transition_triggers", kv.f17646g, zq.f19291l);
        JsonFieldResolver.resolveOptionalList(parsingContext, arVar.D, jSONObject, "variable_triggers", syVar.W8, syVar.U8);
        JsonFieldResolver.resolveOptionalList(parsingContext, arVar.E, jSONObject, "variables", syVar.c9, syVar.f18341a9);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, arVar.F, jSONObject, ViewHierarchyNode.JsonKeys.VISIBILITY, zq.f19288h, kv.f17653o, zq.f19284d);
        yw ywVar = (yw) JsonFieldResolver.resolveOptional(parsingContext, arVar.G, jSONObject, "visibility_action", syVar.f18490o9, syVar.m9);
        List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, arVar.H, jSONObject, "visibility_actions", syVar.f18490o9, syVar.m9);
        lo loVar3 = (lo) JsonFieldResolver.resolveOptional(parsingContext, arVar.I, jSONObject, "width", syVar.V6, syVar.T6);
        if (loVar3 == null) {
            loVar3 = zq.f19285e;
        }
        return new vq(expressionResolveOptionalExpression, expressionResolveOptionalExpression2, listResolveOptionalList, loVar2, ywVar, listResolveOptionalList2, loVar3);
    }
}
