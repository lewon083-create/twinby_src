package fh;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import io.appmetrica.analytics.impl.A2;
import io.sentry.protocol.ViewHierarchyNode;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ce implements Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f17019a;

    public ce(sy syVar) {
        this.f17019a = syVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ae deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        sy syVar = this.f17019a;
        ij.p pVar = syVar.m9;
        ij.p pVar2 = syVar.z1;
        ij.p pVar3 = syVar.X2;
        ij.p pVar4 = syVar.T6;
        ij.p pVar5 = syVar.f18443k1;
        if (((u6) JsonPropertyParser.readOptional(parsingContext, jSONObject, "action_animation", syVar.f18503q1)) == null) {
            Expression expression = fe.f17196a;
        }
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "actions", pVar5);
        TypeHelper typeHelper = fe.f17205k;
        v0 v0Var = v0.f18733v;
        Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", typeHelper, v0Var);
        TypeHelper typeHelper2 = fe.f17206l;
        v0 v0Var2 = v0.f18734w;
        Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", typeHelper2, v0Var2);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, ViewHierarchyNode.JsonKeys.ALPHA, TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, fe.f17211q, fe.f17196a);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", syVar.f18533t1);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, A2.f22054g, syVar.F1);
        TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
        Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "capture_focus_on_action", typeHelper3, function1, fe.f17197b);
        TypeHelper<Long> typeHelper4 = TypeHelpersKt.TYPE_HELPER_INT;
        Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper4, function12, fe.f17212r);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "content_alignment_horizontal", fe.f17207m, v0Var, fe.f17198c);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "content_alignment_vertical", fe.f17208n, v0Var2, fe.f17199d);
        List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", syVar.O2);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "doubletap_actions", pVar5);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", syVar.f18335a3);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", syVar.H3);
        JsonExpressionParser.readExpression(parsingContext, jSONObject, "gif_url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
        lo loVar = (lo) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", pVar4);
        if (loVar == null) {
            loVar = fe.f17200e;
        }
        lo loVar2 = loVar;
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_end_actions", pVar5);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_start_actions", pVar5);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "longtap_actions", pVar5);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "placeholder_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT, fe.f17201f);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "preload_required", typeHelper3, function1, fe.f17202g);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_end_actions", pVar5);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_start_actions", pVar5);
        TypeHelper<String> typeHelper5 = TypeHelpersKt.TYPE_HELPER_STRING;
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "preview", typeHelper5);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", typeHelper5);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper4, function12, fe.f17213s);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "scale", fe.f17209o, be.f16940z, fe.f17203h);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", pVar5);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", syVar.O8);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", kv.f17646g, fe.f17214t);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", syVar.U8);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", syVar.f18341a9);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, ViewHierarchyNode.JsonKeys.VISIBILITY, fe.f17210p, kv.f17653o, fe.i);
        yw ywVar = (yw) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", pVar);
        List optionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", pVar);
        lo loVar3 = (lo) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", pVar4);
        if (loVar3 == null) {
            loVar3 = fe.f17204j;
        }
        return new ae(optionalExpression, optionalExpression2, optionalList, loVar2, ywVar, optionalList2, loVar3);
    }
}
