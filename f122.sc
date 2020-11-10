# -*- mode:text -*-
ifset set3

# Roman's 122-key model F configuration.
# Used with a terminal Model 6110346 and another similar unit


remapblock
  # LHS F-Block is just like XT in (e.g. F1-F10)
  # as for remappings, I'm just stuffing random
  # syms (with the exception of esc and lgui) that linux
  # will accept
  EXTRA_F1    EXECUTE
  EXTRA_F2    ESC         # Need it. Critical.
  EXTRA_F3    HELP
  EXTRA_F4    MENU
  EXTRA_F5    SELECT
  EXTRA_F6    STOP
  EXTRA_F7    AGAIN
  EXTRA_F8    FIND
  EXTRA_F9    LANG_1
  EXTRA_F10   LGUI

  # Fix anti-ISO sentiment in default config
  EUROPE_1  BACKSLASH
  # center of arrow keys
  LANG_4 RGUI

  # Fix the 10key
  # For some reason this is what this is mapped to by soarer
  SCROLL_LOCK  PAD_SLASH
  EXTRA_SYSRQ  PAD_ASTERIX
  PAD_ASTERIX  PAD_MINUS
  PAD_MINUS    PAD_PLUS
  PAD_PLUS     PAD_ENTER
  CAPS_LOCK   BACKSPACE
endblock

# vim: set ft= noet ts=2 sw=2 sts=2 :
