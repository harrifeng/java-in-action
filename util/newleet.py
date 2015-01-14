"""
Usage: python newleet.py --pkg="addtwonumers"
"""
import optparse
import os

class Solution(object):
    def __init__(self, pkg_name):
        root_fd = os.path.split(os.path.dirname(os.path.realpath(__file__)))[0]
        src_fd = os.path.join(root_fd, ('src/main/java/org/hfeng/oj/leet' +
                                          '/%s') % pkg_name)
        src_file = os.path.join(src_fd, "Solution.java")
        test_fd = os.path.join(root_fd, ('src/test/java/org/hfeng/oj/leet' +
                                           '/%s') % pkg_name)
        test_file = os.path.join(test_fd, "SolutionTest.java")
        pkg_loc = "package org.hfeng.oj.leet.%s;" % pkg_name
        self.src_fd = src_fd
        self.test_fd = test_fd
        self.src_file = src_file
        self.test_file = test_file
        self.pkg_loc = pkg_loc

    def new_leet(self):
        print "---------->handling------" +  self.src_fd
        if not os.path.exists(self.src_fd):
            os.mkdir(self.src_fd)
        print "---------->handling------" +  self.src_file
        with open(self.src_file, 'a') as f: f.write(self.pkg_loc)
        print "---------->handling------" +  self.test_fd
        if not os.path.exists(self.test_fd):
            os.mkdir(self.test_fd)
        print "---------->handling------" +  self.test_file
        with open(self.test_file, 'a') as f: f.write(self.pkg_loc)

def main():
    parser = optparse.OptionParser(__doc__.strip())
    parser.add_option("--pkg",
                      help="package name",
                      dest="pkg",
                      default="addtwonumbers")
    (opts, args) = parser.parse_args()
    g_pkg_name = opts.pkg
    solution = Solution(opts.pkg)
    solution.new_leet()


if __name__ == '__main__':
    main()
